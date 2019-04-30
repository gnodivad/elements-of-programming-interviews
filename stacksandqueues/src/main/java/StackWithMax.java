public class StackWithMax {
    private Node first;

    private class Node {
        Integer data;
        Node next;
    }

    public Integer max() {
        Integer max = 0;
        Node current = first;
        while (current != null) {
            max = Math.max(max, current.data);
            current = current.next;
        }
        return max;
    }

    public Integer pop() {
        Node item = first;
        first = first.next;

        return item.data;
    }

    public void push(Integer x) {
        Node oldFirst = first;
        first = new Node();
        first.data = x;
        first.next = oldFirst;
    }
}
