package game;

public interface Destructible {
    void takeDamage(int damage);
    boolean isDestroyed();
}
