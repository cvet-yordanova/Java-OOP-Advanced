package open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.attacks;

import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Attack;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Blob;

public class PutridFart implements Attack {

    @Override
    public void execute(Blob attacker, Blob target) {
        target.setHealth(target.getHealth() - attacker.getDamage());
    }
}
