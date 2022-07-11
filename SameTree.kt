class SameTree {

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (q == null || p == null) return false
        if (p.`val` != q.`val`) return false
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left)
    }
}

fun main() {

}
