public class Car {
    int speed;
    double regularPrice;
    String color;

    //constructor
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    //method
    public double getSalePrice() {
        return regularPrice;
    }
}