
public class ItemBuilder {
    public String itemType;
    public String materialType;
    public String finishedItem;
    Item myItem = new Item();
    Material myMaterial = new Material();

    public ItemBuilder(){
        buildItem();
    }

    public void buildItem(){
        itemType = myItem.getItem();
        materialType = myMaterial.getMaterial();

        finishedItem = "You've been given a " + itemType + " made of " + materialType + "!";
    }

    @Override
    public String toString(){
        return finishedItem;
    }
}