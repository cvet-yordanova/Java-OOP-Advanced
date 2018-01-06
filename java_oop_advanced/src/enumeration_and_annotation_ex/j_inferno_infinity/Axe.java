package enumeration_and_annotation_ex.j_inferno_infinity;

public class Axe extends Weapon {

    public Axe(String name) {
        super(name, 5, 10, 0, 0, 0);
    }

    @Override
    protected void setSockets(Integer size) {
        super.setSockets(4);
    }
}
