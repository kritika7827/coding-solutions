class SwapPairNodes {
    public ListNode swapPairs(ListNode head) {

        ListNode temp = head;
        if(temp != null && temp.next !=null){
            //System.out.println(temp.val);
            swap(temp);
            swapPairs(temp.next.next);
        }
        return head;
    }

    public void swap(ListNode t1){

        int temp = t1.val;
        t1.val = t1.next.val;
        t1.next.val = temp;

    }
}
