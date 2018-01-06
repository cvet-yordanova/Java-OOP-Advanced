package generics_ex.b_generic_box_integer;


public class Box<T> {
    private T value;
    Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",this.value.getClass().getTypeName(), value);
    }
}
