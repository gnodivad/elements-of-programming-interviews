
public class ReverseSingleSublist {

    /*
     * 8.2
     */

    public static ListNode<Integer> reverseSublist(ListNode<Integer> input, int s, int f) {

        if (s == f) {
            return input;
        }

        ListNode<Integer> dummyHead = new ListNode<>(0, input);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;
        while (k++ < s) {
            sublistHead = sublistHead.next;
        }

        ListNode<Integer> sublistIter = sublistHead.next;

        while (s++ < f) {
            ListNode<Integer> temp = sublistIter.next;
            sublistIter.next = temp.next;
            temp.next = sublistHead.next;
            sublistHead.next = temp;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        reverseSublist(createLinkedList(11, 3, 5, 7, 2), 2, 4);
    }

    public static ListNode<Integer> createLinkedList(Integer... integers) {
        ListNode<Integer> dummyHead = new ListNode<>(null);
        ListNode<Integer> list = dummyHead;
        for (Integer i : integers) {
            list.next = new ListNode<>(i);
            list = list.next;
        }
        return dummyHead.next;
    }
}
