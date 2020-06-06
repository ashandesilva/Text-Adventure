package Item;

import javax.swing.plaf.multi.MultiSeparatorUI;

public class Hammer extends Item{
    public Hammer() {
        super("Hammer");
    }

    @Override
    public void use() {
        System.out.println("Booyah!!!!!!");
    }
}
