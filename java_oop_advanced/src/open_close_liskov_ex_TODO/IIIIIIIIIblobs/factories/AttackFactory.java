package open_close_liskov_ex_TODO.IIIIIIIIIblobs.factories;


import open_close_liskov_ex_TODO.IIIIIIIIIblobs.interfaces.Attack;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.attacks.Blobplode;
import open_close_liskov_ex_TODO.IIIIIIIIIblobs.models.attacks.PutridFart;

public final class AttackFactory {
    private static final String BLOBPLODE_ATTACK_TYPE = "Blobplode";

    private AttackFactory() {
    }

    public static Attack create(String type) {
        if (BLOBPLODE_ATTACK_TYPE.equalsIgnoreCase(type)) {
            return new Blobplode();
        } else {
            return new PutridFart();
        }
    }
}
