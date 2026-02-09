package Lesson05;
import java.util.Scanner;

public class BeerSongTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sodas are we drinkin' today?");
        int inputSoda = scanner.nextInt();

        SodaCounter counter = new SodaCounter(inputSoda);
        counter.sodaCounter();

        scanner.close();

    }
}
