public class Sedan extends Car {
    int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice - (regularPrice * .05);
        } else {
            return regularPrice - (regularPrice * .10);
        }
    }
}
