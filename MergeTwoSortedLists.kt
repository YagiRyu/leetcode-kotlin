class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedLists {

    private var head: ListNode? = null

    fun append(node: Int) {
        val newNode = ListNode(node)
        if (head == null) {
            head = newNode
            return
        }
        var listNode = head
        while (listNode?.next != null) {
            listNode = listNode.next
        }
        listNode?.next = newNode
    }

    fun insert(node: Int) {
        val newNode = ListNode(node)
        newNode.next = head
        head = newNode
    }

    fun print() {
        var currentNode = head
        while (currentNode != null) {
            print(currentNode.`val`)
            currentNode = currentNode.next
        }
    }

    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1?.`val` == null) return list1
        if (list2?.`val` == null) return list2

        val result = ListNode(list1.`val`)
        return list1
    }
}

fun main() {
    val mergeTwoSortedLists = MergeTwoSortedLists()
    mergeTwoSortedLists.append(1)
    mergeTwoSortedLists.append(2)
    mergeTwoSortedLists.append(3)
    mergeTwoSortedLists.append(4)
    mergeTwoSortedLists.append(5)
    mergeTwoSortedLists.append(6)
}
