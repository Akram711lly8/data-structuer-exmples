package fountionCircularlyLinkedList

class CircularlyLinkedList {
    fun size(): Int {
        var tmp: Node<AnyType?> = head
        var size = 0
        if (head == null) {
            return size
        } else {
            size++
            while (tmp.next != null) {
                tmp = tmp.next
                size++
            }
        }
        return size
    }
}