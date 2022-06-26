class MiddleOfTheLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        var fast: ListNode? = head
        var slow: ListNode? = head

        while (fast?.next != null) {
            fast = fast.next?.next
            slow = slow?.next
        }
        return slow
    }
}

fun main() {
    val middleOfTheLinkedList = MiddleOfTheLinkedList()
}
