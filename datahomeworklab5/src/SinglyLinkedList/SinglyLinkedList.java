package SinglyLinkedList;

public class SinglyLinkedList {
        private int size = 0;
        private Node node;

        public void add(Object data) {
                if (data == null) {
                        return;
                }
                if (node == null) {
                        node = new Node(data);
                } else {
                        Node newNode = new Node(data);
                        Node lastNode = getLastNode(node);
                        lastNode.setNode(newNode);
                }
                size++;
        }


        private Node getLastNode(Node node) {
                Node lastNode = node;
                if (lastNode.getNode() != null) {
                        return getLastNode(lastNode.getNode());
                } else {
                        return lastNode;
                }
        }

        private Node next(Node node) {
                if (node.getNode() != null) {
                        return node.getNode();
                } else {
                        return null;
                }
        }

        public int size() {
                return this.size;
        }

        @Override
        public String toString() {
                String represent = "[";
                Node nextNode = this.node;
                while (nextNode != null) {
                        represent = represent + nextNode.toString();
                        nextNode = next(nextNode);
                        if (nextNode != null) {
                                represent = represent + ",";
                        }
                }
                represent = represent + "]";
                return represent;
        }
}