package Lesson05;

public class SodaCounter {

    private int sodaCount;

    public SodaCounter(int sodaCount) {
        this.sodaCount = sodaCount;

    }

    public void sodaCounter() {

        while (sodaCount > 0) {
            if (sodaCount > 0) {
                System.out.println(sodaCount + " bottles of soda on the wall,  " + sodaCount + " bottles of soda!");

                sodaCount--;

                System.out.println("Take one down, pass it around, " + sodaCount + " bottles of soda on the wall.\n");
            }

        }

        System.out.println("No more bottles of soda on the wall! \uD83C\uDF7E");

    }

}
