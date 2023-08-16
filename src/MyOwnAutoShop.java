import java.net.SocketOption;

public class MyOwnAutoShop {



    public static void main(String[] args) {
        //instance of Sedan class
        Sedan mySedan = new Sedan(45,20000,"blue",25);

        //two instances of Ford class
        Ford myFirstFord = new Ford(55, 25000,"red",2019, 500);
        Ford mySecondFord = new Ford(65, 35000,"orange",2023, 1500);

        //Car class instance
        Car myCar = new Car(45, 15000, "purple");

        //display sale prices for all instances
        System.out.println(mySedan.getSalePrice());
        System.out.println(myFirstFord.getSalePrice());
        System.out.println(mySecondFord.getSalePrice());
        System.out.println(myCar.getSalePrice());

    }



}
