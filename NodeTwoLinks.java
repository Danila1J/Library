public class NodeTwoLinks<T> {
    private T data;
    private NodeTwoLinks next;
    private NodeTwoLinks prev;

    public NodeTwoLinks(T data, NodeTwoLinks next, NodeTwoLinks prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodeTwoLinks getNext() {
        return next;
    }

    public void setNext(NodeTwoLinks next) {
        this.next = next;
    }

    public NodeTwoLinks getPrev() {
        return prev;
    }

    public void setPrev(NodeTwoLinks prev) {
        this.prev = prev;
    }

    public String toString(){
        String out="";
        return out=data.toString();
    }
}
