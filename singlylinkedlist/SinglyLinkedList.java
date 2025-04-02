package singlylinkedlist;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(Node headNode){
        this.head = headNode;
    }

    public String printLinkedList(){
        String output = "";
        Node currentNode = head;
        while(currentNode != null){
            output = output + currentNode.getNum() + " --> ";
            currentNode = currentNode.getNextPointer();
        }

        output = output + " null";

        return output;
    }
}
