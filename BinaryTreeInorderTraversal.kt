class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinaryTreeInorderTraversal {

    private fun helper(root: TreeNode, result: ArrayDeque<Int>) {
        root.left?.let { helper(it, result) }
        result.addLast(root.`val`)
        root.right?.let { helper(it, result) }
    }

    fun inorderTraversal(root: TreeNode?): List<Int> {
        val result = ArrayDeque<Int>()

        if (root == null) return result.toList()
        helper(root, result)

        return result.toList()
    }
}

fun main() {

}
