package fastcampus.chapter1;


// Node 클래스 구현
class Node<T> {
    T data;
    Node<T> next = null;

    public Node(T data) {
        this.data = data;
    }
}
// 링크드 리스트에 데이터 추가
class SingleLinkedList<T> {
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
}

public class 링크드리스트01 {

    public static void main(String[] args) {
        // node 와 node 연결하기 : node 인스턴스간 연결
        Node<Integer> node1 = new Node<Integer>(1);
        Node<Integer> node2 = new Node<Integer>(2);
        node1.next = node2;
        Node head = node1;


        // 링크드리스트 데이터 출력하기
        SingleLinkedList<Integer> myLinkedList = new SingleLinkedList<Integer>();
        myLinkedList.addNode(1);
        System.out.println(myLinkedList.head.next);
        System.out.println(myLinkedList.head.data);
        myLinkedList.addNode(2);
        System.out.println(myLinkedList.head.next);
        System.out.println(myLinkedList.head.next.data);
        myLinkedList.addNode(3);
        myLinkedList.printAll();
    }
}
