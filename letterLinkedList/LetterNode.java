package letterLinkedList;

public class LetterNode {
    private char letter;
    private LetterNode nextPointer;

    public LetterNode(char letter){
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public LetterNode getNextPointer() {
        return nextPointer;
    }

    public void setNextPointer(LetterNode nextPointer) {
        this.nextPointer = nextPointer;
    }

    @Override
    public String toString() {
        return "LetterNode{" +
                "letter=" + letter +
                ", nextPointer=" + nextPointer +
                '}';
    }
}
