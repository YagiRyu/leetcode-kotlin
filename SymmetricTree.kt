class SymmetricTree {

    private fun isSubtreeSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left == null && right == null) return true
        if (left?.`val` != right?.`val`) return false
        return isSubtreeSymmetric(left?.left, right?.right) && isSubtreeSymmetric(left?.right, right?.left)
    }

    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return isSubtreeSymmetric(root.left, root.right)
    }
}

fun main() {

}
