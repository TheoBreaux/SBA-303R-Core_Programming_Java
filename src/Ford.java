public class Ford extends Car {
    int year;
    int manufactureDiscount;


    public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufactureDiscount;
    }

}
