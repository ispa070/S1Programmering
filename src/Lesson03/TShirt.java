package Lesson03;

//TShirtClass.java
public class TShirt {
    String brand;
    String color;
    String size;
    String print;
    float price;
    int quantity;


    public void showCollection() {
        System.out.println(quantity + " stk af mærket - " + brand + " - med et " + print + " print - i " + color + " farve.");
        System.out.println("Indkøbspris (fra ny): " + price + " kr.\n");

    }

    public void showCollectionMulti() {
        System.out.println(quantity + " stk af mærket - " + brand + " - med et " + print + " print - i " + color + " farve.");
        System.out.println("Indkøbspris (fra ny): " + (price * quantity) + " kr.\n");
    }
}
