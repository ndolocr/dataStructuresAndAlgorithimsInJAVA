package singlylinkedlist;

public class MainClass {
    public static void main(String[] args) {
        // Create New Node to be used as the head of the Singly linked list
        Node headNode = new Node(10);

        SinglyLinkedList sll = new SinglyLinkedList(headNode);

        //Create 5 more additional Nodes to be linked.
        Node firstNode = new Node(20);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(40);
        Node fourthNode = new Node(50);
        Node fifthNode = new Node(60);

        //Set pointer next pointer for head Node
        headNode.setNextPointer(firstNode);
        firstNode.setNextPointer(secondNode);
        secondNode.setNextPointer(thirdNode);
        thirdNode.setNextPointer(fourthNode);
        fourthNode.setNextPointer(fifthNode);

        //Print Linked list
        System.out.println(sll.printLinkedList());
    }

}
