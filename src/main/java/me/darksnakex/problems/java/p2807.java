package me.darksnakex.problems.java;

public class p2807 {



      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode puntero = head;
        ListNode sig;

        while(puntero.next != null){
            System.out.println("val1 = " + puntero.val + " val2 = " + puntero.next.val);
            ListNode temp = new ListNode(calcularmcm(puntero.val,puntero.next.val));
            sig = puntero.next;
            puntero.next = temp;
            temp.next = sig;
            puntero = sig;


        }

        return head;


    }

    private int calcularmcm(int val, int val1) {

        int max = Math.max(val,val1);

        for(int i = max; i >= 0; i-- ){
            if(val % i == 0 && val1 % i == 0){
                return i;
            }
        }
        return 1;

    }

}
