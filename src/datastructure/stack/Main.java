package datastructure.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(7);
        myStack.push(23);
        myStack.push(11);
        myStack.push(15);
        myStack.pop();
        myStack.printStack();
    }
}
