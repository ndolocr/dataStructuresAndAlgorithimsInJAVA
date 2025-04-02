package singlylinkedlist;

public class Node {
    private int num;
    private Node nextPointer;

    public Node(int number){
        this.num = number;
    }

    public void setNum(int number){
        this.num = number;
    }

    public int getNum() {
        return this.num;
    }

    public void setNextPointer(Node nextPointer) {
        this.nextPointer = nextPointer;
    }

    public Node getNextPointer() {
        return this.nextPointer;
    }
}
