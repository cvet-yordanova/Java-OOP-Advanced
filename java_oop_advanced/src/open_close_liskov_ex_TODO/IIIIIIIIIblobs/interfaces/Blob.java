package open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces;

public interface Blob {

    int getHealth();

    void setHealth(int health);

    int getDamage();

    void setDamage(int currentDamage);

    Behavior getBehavior();

    String getName();

    void attack(Blob target);

    void update();

    void attach(Observer observer);
}
