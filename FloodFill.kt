class FloodFill {
    fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
        if (image[sr][sc] == color) return image
        return floodFill(image, sr, sc, image[sr][sc], color)
    }

    private fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, oldColor: Int, newColor: Int): Array<IntArray> {
        if (sr < 0 || sc < 0 || sr >= image.size || sc >= image[0].size || image[sr][sc] != oldColor) return image
        image[sr][sc] = newColor
        floodFill(image, sr - 1, sc, oldColor, newColor)
        floodFill(image, sr + 1, sc, oldColor, newColor)
        floodFill(image, sr, sc - 1, oldColor, newColor)
        floodFill(image, sr, sc + 1, oldColor, newColor)
        return image
    }
}

fun main() {

}
