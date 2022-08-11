package fastcampus.chapter1;

import java.sql.Time;
import java.util.*;

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
            Node findNode = this.head;
            while (true) {
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }
                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
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
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
            return null;
        }
    }

//    public boolean insertNode(int data) {
//        if (this.head == null) {
//            this.head = new Node(data);
//        } else {
//            Node nodeFind = this.head;
//            while (true) {
//                if (data > nodeFind.value) {
//                    if (nodeFind.right != null) {
//                        nodeFind = nodeFind.right;
//                    } else {
//                        nodeFind.right = new Node(data);
//                        break;
//                    }
//                } else {
//                    if (nodeFind.left != null) {
//                        nodeFind = nodeFind.left;
//                    } else {
//                        nodeFind.left = new Node(data);
//                        break;
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//
//    public Node search(int data) {
//        if (this.head == null) {
//            return null;
//        } else {
//            Node nodeFind = this.head;
//            while (nodeFind != null) {
//                if (nodeFind.value == data) {
//                    return nodeFind;
//                } else if (data < nodeFind.value) {
//                    nodeFind = nodeFind.left;
//                } else {
//                    nodeFind = nodeFind.right;
//                }
//            }
//            return  null;
//        }
//    }
}



public class 트리Test {

    public static void main(String[] args) {
        int target = 59;
        List<Integer> list = new ArrayList<>();
        NodeMgmtTest nodeMgmtTest = new NodeMgmtTest();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < i; j++) {
                if (list.get(i) == list.get(j)) {
                    i--;
                }
            }
        }
//        for (Integer i : list) {
//            nodeMgmtTest.insertNode(i);
//        }
//
        Collections.sort(list);
        long startTime = System.currentTimeMillis();
        forSearch(target, list);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

//        long startTime2 = System.currentTimeMillis();
//        bstMethod(target, nodeMgmtTest);
//        long endTime2 = System.currentTimeMillis();
//        System.out.println(endTime2 - startTime2);

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
