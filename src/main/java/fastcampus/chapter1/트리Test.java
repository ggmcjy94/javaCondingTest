package fastcampus.chapter1;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

class NodeMgmtTest{

    Node head = null;

    public class Node {
        int value;
        Node left, right;

        public Node(int data) {
            this.value = data;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        if (this.head == null) {
            this.head = new Node(data);
        } else {
            Node nodeFind = this.head;
            while (true) {
                if (data > nodeFind.value) {
                    if (nodeFind.right != null) {
                        nodeFind = nodeFind.right;
                    } else {
                        nodeFind.right = new Node(data);
                        break;
                    }
                } else {
                    if (nodeFind.left != null) {
                        nodeFind = nodeFind.left;
                    } else {
                        nodeFind.left = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }


    public Node search(int data) {
        if (this.head == null) {
            return null;
        } else {
            Node nodeFind = this.head;
            while (nodeFind != null) {
                if (nodeFind.value == data) {
                    return nodeFind;
                } else if (data < nodeFind.value) {
                    nodeFind = nodeFind.left;
                } else {
                    nodeFind = nodeFind.right;
                }
            }
            return  null;
        }
    }
}



public class 트리Test {

    public static void main(String[] args) {
        int target = 59342;
        List<Integer> list = new ArrayList<>();
        NodeMgmtTest nodeMgmtTest = new NodeMgmtTest();
        for (int i = 1; i <= 1000000; i++) {
            list.add(i);
            nodeMgmtTest.insertNode(i);
        }
        long startTime = System.currentTimeMillis();
        System.out.println(nodeMgmtTest.search(target).value + "찾았다");
        forSearch(target, list);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        long startTime2 = System.currentTimeMillis();
        System.out.println(nodeMgmtTest.search(target).value + "찾았다");
        bstMethod(target, nodeMgmtTest);
        long endTime2 = System.currentTimeMillis();
        System.out.println(endTime2 - startTime2);



    }

    private static void forSearch(int target, List<Integer> list) {
        for (Integer i : list) {
            if (target == i) {
                System.out.println(i + "찾음");
            }
        }
    }

    private static void bstMethod(int target, NodeMgmtTest nodeMgmtTest) {
        System.out.println(nodeMgmtTest.search(target).value + " 찾음");
    }


}
