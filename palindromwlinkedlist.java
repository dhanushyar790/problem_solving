
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode current=head;
        ListNode prev=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
        head=prev;
        if(head.next==dummy.next){
            return true;
        }
        return false;

    }
}
