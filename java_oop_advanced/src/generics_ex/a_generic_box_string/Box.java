package generics_ex.a_generic_box_string;


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
