import kotlin.math.max

class MaxAreaOfIsland {
    fun maxAreaOfIsland(grid: Array<IntArray>): Int {
        var maxArea = 0

        fun getAreaAndHideTheIsland(i: Int, j: Int): Int {
            var result = 0
            if (i in grid.indices && j in grid.first().indices && grid[i][j] == 1) {
                grid[i][j] = 0
                result++
                result += getAreaAndHideTheIsland(i - 1, j)
                result += getAreaAndHideTheIsland(i + 1, j)
                result += getAreaAndHideTheIsland(i, j - 1)
                result += getAreaAndHideTheIsland(i, j + 1)
            }
            return result
        }

        for (i in grid.indices) {
            for (j in grid.first().indices) {
                if (grid[i][j] == 1) {
                    maxArea = maxOf(maxArea, getAreaAndHideTheIsland(i, j))
                }
            }
        }
        return maxArea
    }
}

fun main() {
    val maxAreaOfIsland = MaxAreaOfIsland()
}
