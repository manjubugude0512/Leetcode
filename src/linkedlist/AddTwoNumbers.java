package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode ptr=res;
        int carry=0;
        while(l1!=null || l2!=null){
            int x=(l1!=null)?l1.val:0;
            int y=(l2!=null)?l2.val:0;
            int sum=x+y+carry;
            ListNode l3=new ListNode(sum%10);
            ptr.next=l3;
            ptr=ptr.next;
            carry=sum/10;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(carry>0){
            ptr.next=new ListNode(carry);
        }
        return res.next;
    }
}
