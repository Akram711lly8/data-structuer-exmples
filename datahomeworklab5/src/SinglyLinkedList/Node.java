package SinglyLinkedList;

public class Node {


        private Object data ;
        
        private Node node;


        public Node(Object data) {
                this.data = data;
        }


        public Node getNode() {
                return node;
        }


        public void setNode(Node node) {
                this.node = node;
        }


        public Object getData() {
                return data;
        }


        public void setData(Object data) {
                this.data = data;
        }


        @Override
        public String toString() {
                return data+"" ;
        }


        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((data == null) ? 0 : data.hashCode());
                result = prime * result + ((node == null) ? 0 : node.hashCode());
                return result;
        }


        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (!(obj instanceof Node))
                        return false;
                Node other = (Node) obj;
                if (data == null) {
                        if (other.data != null)
                                return false;
                } else if (!data.equals(other.data))
                        return false;
                if (node == null) {
                        if (other.node != null)
                                return false;
                } else if (!node.equals(other.node))
                        return false;
                return true;
        }


}