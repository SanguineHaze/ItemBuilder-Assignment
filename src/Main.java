

// create a random Item generator that prints your resulting item to the console
//Item should be it's own Java Class, and should have the following components:
// 1) a Constructor
// 2) Item Type
// 3) Item Material
// Bonus points for: Item Name or Item Value or Both.

//Main should create an instance of the item, and print it out to the console.

//Helpful hints:
// 1) import Random (import java.util.Random;)
// 2) use a List of some type for the Type, and another List for Material. (You don't NEED a list, but it'll be easier)

public class Main {
    public static void main(String[] args) {
        System.out.println("Item 1 is:");
        ItemBuilder item1 = new ItemBuilder();
        System.out.println(item1.finishedItem);

        System.out.println("Item 2 is:");
        ItemBuilder item2 = new ItemBuilder();
        System.out.println(item2.finishedItem);
    }
}
