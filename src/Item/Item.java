package Item;

public class Item {
    public String name;

    public Item(String name) {
        this.name = name;
    }

    public void use(){
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
