package leetcode;



 //Definition for singly-linked list.
//class ListNode1 {
//     int val;
//     ListNode1 next;
//     ListNode1() {}
//     ListNode1(int val) {
//         this.val = val;
//     }
//     ListNode1(int val, ListNode1 next) {
//         this.val = val; this.next = next;
//     }
// }
public class _876_MiddleOfTheLinkedList {
    // 워커 러너 테크닉
    // walker = 한번에 한칸씩
    //  runner = 한번에 두칸씩
    // runner 가 끝나면 walker는 중간에 와잇음
    // 구현을 위한 브레인 스토밍
    // walker : 1x 2
    // runner : 1 2 null x
    //
    // walker : 1 2x 3
    // runner : 1 2 3 nullx
    // while loop 마다
    // 러너 1 칸 전진워커 1 칸 전진 러너 1 칸 전진
    public ListNode middleNode(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;

        while (runner != null) {
            runner = runner.next;
            if (runner != null) {
                walker = walker.next;
                runner = runner.next;
            }
        }
        return walker;
    }


}
