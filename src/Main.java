
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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ItemBuilder itemResult = new ItemBuilder();
        int numItems = 0;

        System.out.println("Good day dearest customer. I am the magnificent Magnus, owner of this mobile shop of wonders. " +
                "Today only, I will be providing an endless supply of amazing items for all your adventuring needs!" +
                " So, tell me, adventurer.... how many of Magnus' magnificent items do you desire?");
        System.out.println("--PLEASE ENTER AN INTEGER--");
        Scanner scanner = new Scanner(System.in);

        try{
            String input = scanner.nextLine();
            try{
                numItems = Integer.parseInt(input.trim());
                if(numItems < 1){
                    System.out.println("The Magnificent Magnus cannot provide you less than 1 item!");
                }
            }catch(Exception e){
                System.out.println("You must enter numeric values!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(int i = 0; i < numItems; i++){

            itemResult.buildItem();
            System.out.println(itemResult);

        }


        /*
        System.out.println("Item 1 is:");
        ItemBuilder item1 = new ItemBuilder();
        System.out.println(item1.finishedItem);

        System.out.println("Item 2 is:");
        ItemBuilder item2 = new ItemBuilder();
        System.out.println(item2.finishedItem);
        */
    }
}
