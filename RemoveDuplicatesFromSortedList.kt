class RemoveDuplicatesFromSortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) {
            return head
        }

        var search = head
        while (search?.next != null) {
            if (search.`val` == search.next?.`val`) {
                search.next = search.next?.next
            } else {
                search = search.next
            }
        }
        return search
    }
}

fun main() {

}
