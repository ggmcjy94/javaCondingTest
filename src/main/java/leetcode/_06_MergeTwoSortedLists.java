package leetcode;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
public class _06_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result_node = new ListNode();

        ListNode curr_node = result_node;

        while (list1 != null && list2 != null) {
            System.out.println(list1.val);
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
}
