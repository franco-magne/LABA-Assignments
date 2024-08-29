package characters;

import itemmagic.InsufficientMagicException;
import itemmagic.ItemMagic;
import itemmagic.MagicAttack;
import weapons.Weapon;
import java.util.HashSet;
import java.util.Set;

public class Kratos extends Character {
    private int magicBar;
    private int itemBar;
    private Set<Weapon> weaponsEquipped;
    private Set<ItemMagic> magicsEquipped;
    private Set<ItemMagic> itemsEquipped;

    public Kratos(String name, int healthBar, String type) {
        super(name, healthBar, type);
    }

    public Kratos(String name, int healthBar, String type, int magicBar, int itemBar) {
        super(name, healthBar, type);
        this.magicBar = magicBar;
        this.itemBar = itemBar;
        this.weaponsEquipped = new HashSet<>();
        this.magicsEquipped = new HashSet<>();
        this.itemsEquipped = new HashSet<>();
    }

    public void useMagicAttack(ItemMagic magic) {
        MagicAttack attack = new MagicAttack();

        try {
            attack.performMagicAttack(magic, magicBar);
        } catch (InsufficientMagicException e) {
            System.out.println(e.getMessage());
            System.out.println(e.informInsufficientMagic());
        }
    }

    public void addMagicPower(ItemMagic newMagic) {
        this.magicsEquipped.add(newMagic);
    }

    public void addItemPower(ItemMagic newItem) {
        this.itemsEquipped.add(newItem);
    }

    public void addWeapon(Weapon newWeapon) {
        this.weaponsEquipped.add(newWeapon);
    }

    public int getMagicBar() {
        return magicBar;
    }

    public void setMagicBar(int magicBar) {
        this.magicBar = magicBar;
    }

    public int getItemBar() {
        return itemBar;
    }

    public void setItemBar(int itemBar) {
        this.itemBar = itemBar;
    }

    public Set<ItemMagic> getMagicsEquipped() {
        return magicsEquipped;
    }

    public void setMagicsEquipped(Set<ItemMagic> magicsEquipped) {
        this.magicsEquipped = magicsEquipped;
    }

    public Set<ItemMagic> getItemsEquipped() {
        return itemsEquipped;
    }

    public void setItemsEquipped(Set<ItemMagic> itemsEquipped) {
        this.itemsEquipped = itemsEquipped;
    }

    public Set<Weapon> getWeaponsEquipped() {
        return weaponsEquipped;
    }

    public void setWeaponsEquipped(Set<Weapon> weaponsEquipped) {
        this.weaponsEquipped = weaponsEquipped;
    }
}