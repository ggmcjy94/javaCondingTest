package fastcampus.chapter1;


class SingleLinkedList02<T> {
    public Node<T> head = null;
    public class Node<T> {
        T data;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }
    public void addNode(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> node = this.head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while(node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    // 01 에서 추가됌
    public void  addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);
        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<>(data);
            searchedNode.next.next = nextNode;
        }
    }

    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while(node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }
    private Node<T> search(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }



}
public class 링크드리스트02 {

    public static void main(String[] args) {
        SingleLinkedList02<Integer> myLinkedList = new SingleLinkedList02<>();

        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);


//        myLinkedList.printAll();

        myLinkedList.addNodeInside(5, 1);
//        myLinkedList.printAll();

        myLinkedList.addNodeInside(6, 3);
//        myLinkedList.printAll();

        myLinkedList.addNodeInside(7, 6);
//        myLinkedList.printAll();
        myLinkedList.delNode(3);
        myLinkedList.printAll();
    }

}
