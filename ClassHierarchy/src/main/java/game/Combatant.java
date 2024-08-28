package game;

public interface Combatant {
    void attack();
    void defend();
    void takeDamage(int damage);
    boolean isAlive();
}
