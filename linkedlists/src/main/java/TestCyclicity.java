public class TestCyclicity {

    /*
     * 8.3
     */

    public static ListNode<Integer> isCyclic(ListNode<Integer> list) {
        ListNode<Integer> head = list;
        ListNode<Integer> fast = head, slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int cycle = 0;

                do {
                    ++cycle;
                    fast = fast.next;
                } while (slow != fast);

                ListNode<Integer> nodeAdvancedItr = head;
                while (cycle-- > 0) {
                    nodeAdvancedItr = nodeAdvancedItr.next;
                }

                ListNode<Integer> nodeItr = head;
                while (nodeAdvancedItr != nodeItr) {
                    nodeAdvancedItr = nodeAdvancedItr.next;
                    nodeItr = nodeItr.next;

                    System.out.println(nodeItr.data + " " + nodeAdvancedItr.data);
                }

                return nodeItr;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode<Integer> list = createLinkedList(1, 2, 3, 4, 5);
        ListNode<Integer> cycleNode = list.get(5);
        cycleNode.next = list.get(3);
        isCyclic(list);
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
