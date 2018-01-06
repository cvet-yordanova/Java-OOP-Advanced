package enumeration_and_annotation_ex.j_inferno_infinity;

public class Knife extends Weapon{

    public Knife(String name) {
        super(name, 3, 4, 0, 0, 0);
    }

    @Override
    protected void setSockets(Integer size) {
        super.setSockets(2);
    }
}
