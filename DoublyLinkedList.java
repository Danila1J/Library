public class DoublyLinkedList<T> {
    private NodeTwoLinks<T> head;
    private int size;

    public int getSize() {
        return size;
    }
    // переделать ???
    public void setSize(int size) {
        int count=this.size;
        for (int i = count; i <size ; i++) {
            addToTail(null);
        }
    }

    public DoublyLinkedList() {
        head = new NodeTwoLinks(null, null, null);
        head.setNext(head);
        head.setPrev(head);
    }

    // +
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    // +
    public boolean addToTail(T element) {
        NodeTwoLinks last = head.getPrev();
        NodeTwoLinks newNode = new NodeTwoLinks(element, head, head.getPrev());
        newNode.getPrev().setNext(newNode);
        newNode.getNext().setPrev(newNode);
        size++;
        return true;
    }

    // +
    public boolean addNode(int index, T element) {
        if (index == size) {
            addToTail(element);
            return true;
        }
        int count = 0;
        NodeTwoLinks t = head;
        while (t.getNext() != head) {
            if (count == index) {
                NodeTwoLinks n = new NodeTwoLinks(element, t.getNext(), t);
                t.getNext().setPrev(n);
                t.setNext(n);
            }
            t = t.getNext();
            count++;
        }
        return true;
    }

    // +
    public NodeTwoLinks get(int index) {
        int count = 0;
        NodeTwoLinks t = head;
        while (t.getNext() != head) {
            if (count == index) {
                return t.getNext();
            }
            t = t.getNext();
            count++;
        }
        return null;
    }

    // +
    public boolean delNode(int index) {
        int count = 0;
        NodeTwoLinks t = head;
        while (t.getNext() != head) {
            if (count == index) {
                t.setNext(t.getNext().getNext());
                t.getNext().getNext().setPrev(t);
            }
            t = t.getNext();
            count++;
        }
        return true;
    }

    // +
    public void setNode(int index, T element) {
        NodeTwoLinks n = head;
        int count = 0;
        if (index == 0) {
            NodeTwoLinks n1 = new NodeTwoLinks(element, n.getNext().getNext(), n);
            n.getNext().getNext().setPrev(n1);
            head.setNext(n1);
        }
        while (n.getNext() != head) {
            if (count == index) {
                NodeTwoLinks n1 = new NodeTwoLinks(element, n.getNext().getNext(), n);
                n.getNext().getNext().setPrev(n1);
                n.setNext(n1);
                return;
            }
            n = n.getNext();
            count++;
        }
    }
}
