package Lesson03;

public class TheGreatTShirtShowMain {

    public static void main(String[] Args) {

        System.out.println("Tillykke! Du har den fedeste t-shirt samling i hele byen.\nHer er et overblik over din samling:\n");

        String brand = "Carhartt";
        String color = "sort";
        String size = "medium";
        String print = "klassisk logo";
        float price = 299.95f;
        int quantity = 1;

        AddNewTShirt(brand, color, size, print, price, quantity);

        String brand2 = "Uniqlo";
        String color2 = "hvid";
        String size2 = "large";
        String print2 = "uden logo";
        float price2 = 149.95f;
        int quantity2 = 3;

        AddNewTShirt(brand2, color2, size2, print2, price2, quantity2);

    }

    public static void AddNewTShirt(String brand, String color, String size, String print, float price, int quantity) {

        var t = new TShirt(); //Her laver vi et objekt, der hedder "TShirt"

        t.brand = brand;
        t.color = color;
        t.size = size;
        t.print = print;
        t.price = price;
        t.quantity = quantity;

        if (t.quantity > 1) {
            t.showCollectionMulti();
        } if else (t.quantity == 0) {
            t.showCollection();

        } if (t.quantity > 1) = true {
            t.showCollection();

        }
    }

}
