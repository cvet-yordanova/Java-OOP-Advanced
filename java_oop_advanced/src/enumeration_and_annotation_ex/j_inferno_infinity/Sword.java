package enumeration_and_annotation_ex.j_inferno_infinity;

public class Sword extends Weapon{
    public Sword(String name) {
        super(name, 4, 6, 0, 0, 0);
    }

    @Override
    protected void setSockets(Integer size) {
        super.setSockets(3);
    }
}
