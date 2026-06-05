package doublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList newList = new DoublyLinkedList(1);
        newList.append(2);
        newList.append(3);
        newList.append(4);
        System.out.println(newList.remove(1).value);
        newList.printList();
    }
}
