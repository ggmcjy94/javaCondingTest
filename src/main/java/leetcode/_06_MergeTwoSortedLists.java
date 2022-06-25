package leetcode;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class _06_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result_node = new ListNode();
        ListNode curr_node = result_node;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr_node.next = list1;
                list1 = list1.next;
            } else {
                curr_node.next = list2;
                list2 = list2.next;
            }

            curr_node = curr_node.next;
        }

        if (list1 == null) {
            curr_node.next = list2;
        }
        if (list2 == null) {
            curr_node.next = list1;
        }
        return result_node.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;

        while (l1 != null || l2 != null) {
            if (l1 == null) { //끝에 도달 한 경우
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            } else if (l2 == null) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else if (l1.val < l2.val){
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
