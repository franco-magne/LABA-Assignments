package itemmagic;

public class MagicAttack {

    public void performMagicAttack(ItemMagic itemMagic, int currentMagic) throws InsufficientMagicException {
        if (currentMagic < itemMagic.getCostOfBar()) {
            throw new InsufficientMagicException(itemMagic.getCostOfBar(), currentMagic);
        }
        System.out.println("Magic attack performed successfully!");
    }
}
