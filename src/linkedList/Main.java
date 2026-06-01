package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList newLinkedList = new LinkedList(0);
        newLinkedList.append(1);
        newLinkedList.append(2);
        newLinkedList.append(3);
        newLinkedList.reverse();
        newLinkedList.printList();
    }
}