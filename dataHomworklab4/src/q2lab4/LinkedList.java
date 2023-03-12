package q2lab4;

class LinkedList {
    Node start;
    LinkedList() {
        start = null;
    }
    public void push(int data)
    {
        if(this.start == null)
        {
            Node temp = new Node(data);
            this.start = temp;
        }
        else
        {
            Node temp = new Node(data);
            temp.next = this.start;
            this.start = temp;
        }
    }
    public int findSecondLastNode(Node ptr)
    {
        Node temp = ptr;

        if(temp == null || temp.next == null)
            return -1;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        return temp.data;
    }
}