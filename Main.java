public class Main {
    int x = 5;

    public static void main(String[] args) {
       Person myName = new Person();
       System.out.println(myName.getName());
       myName.setName("Radha");
       System.out.println(myName.getName());
    }
}