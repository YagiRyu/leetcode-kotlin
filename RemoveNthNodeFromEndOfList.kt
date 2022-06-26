class RemoveNthNodeFromEndOfList {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if (head!!.next == null) return null

        var flagIndex = 0
        var deleteIndex = 0
        var flagNode = head
        var deleteNode = head

        while (flagNode?.next != null) {
            flagIndex++
            flagNode = flagNode.next

            if (deleteIndex == flagIndex - n - 1) {
                deleteIndex++
                deleteNode = deleteNode?.next
            }
        }
        if (flagIndex == n - 1) {
            return deleteNode?.next
        } else {
            deleteNode?.next = deleteNode?.next?.next
        }
        return head
    }
}
