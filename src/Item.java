import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Item {
    private ArrayList<String> itemList; //Declare the list!
    //private Random rand = new Random();
    //private String item;


    public Item(){
        itemList = new ArrayList<>(); //Make the list exist!
        setItemList();
        //chooseItem();
    }

    //Actually set the items in the list!
    public void setItemList(){
        //itemList.add("Sword");
        //itemList.add("Spear");
        //itemList.add("Axe");

        itemList.addAll(Arrays.asList("Shortsword", "Spear", "Longsword", "Axe", "Club", "Dagger", "Poleaxe"));
    }

    /*
    public String chooseItem(){
        int randomItem = rand.nextInt(itemList.size());
        item = itemList.get(randomItem);
        return item;
    }
    */

    public String getItem(){
        Random rand = new Random();
        int randomItem = rand.nextInt(itemList.size());
        String chosenItem = itemList.get(randomItem);
        return chosenItem;
    }
}
