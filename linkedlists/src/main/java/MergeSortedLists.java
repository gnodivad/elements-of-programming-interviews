public class MergeSortedLists {

    /*
     * 8.1
     */

    public static ListNode<Integer> mergeLists1(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> p1 = list1 != null ? list1.get(1) : null;
        ListNode<Integer> p2 = list2 != null ? list2.get(1) : null;
        ListNode<Integer> current = null;
        ListNode<Integer> begin = new ListNode<>(null);

        while (p1 != null || p2 != null) {

            if (p1 != null && p2 != null) {
                if (p1.data <= p2.data) {
                    begin = begin.data == null ? p1 : begin;
                    current = p1;
                    p1 = p1.next;
                    current.next = p2;
                } else if (p2.data < p1.data) {
                    begin = begin.data == null ? p2 : begin;
                    current = p2;
                    p2 = p2.next;
                    current.next = p1;
                }
            } else if (p1 != null) {
                begin = begin.data == null ? p1 : begin;
                p1 = p1.next;
            } else {
                begin = begin.data == null ? p2 : begin;
                p2 = p2.next;
            }
        }

        return begin;
    }

}
