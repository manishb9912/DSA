package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newList = new DoublyLinkedList(7);
        newList.append(10);
        newList.append(20);
        newList.set(1, 80);

        newList.printList();
    }
}
