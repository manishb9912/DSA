public class Main {
    int x = 5;

    public static void main(String[] args) {
        Car myCar = new Car("Volvo", 9000000, "Graphite Grey");
        System.out.println(myCar.name + " " + myCar.price + " " + myCar.color);
        myCar.speed(200);
        myCar.fullThrottle();
    }
}