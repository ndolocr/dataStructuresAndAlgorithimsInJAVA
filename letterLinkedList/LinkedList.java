package letterLinkedList;

public class LinkedList {
    private LetterNode head;

    public LinkedList(LetterNode node) {
        this.head = node;
    }

    public String printLinkedList(){
        LetterNode currentNode = this.head;
        String output = "";
        while(currentNode != null){
            output += currentNode.getLetter() + " ---> ";
            currentNode = currentNode.getNextPointer();
        }

        output +=" null";

        return  output;
    }
}
