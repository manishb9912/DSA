public class Car {
    String name;
    int price;
    String color;

    public Car(String carName, int carPrice, String carColor) {
        name = carName;
        price = carPrice;
        color = carColor;
    }

    public void fullThrottle() {
        System.out.println("The car is in full throttle");
    }

    public void speed(int maxSpeed) {
        System.out.println("The top speed of the car: " + maxSpeed);
    }
}