package reflection_ex.b_black_box_integer;

public class PeshoslavClass {

    private int innerValue;

    public PeshoslavClass() {
        this.innerValue = 0;
    }

    private void add(int added){
        this.innerValue += added;
    }

    private void subtract(int subtracted){
        this.innerValue -= subtracted;
    }

    private void multiply(int multiplier){
        this.innerValue *= multiplier;
    }

    private void divide(int divider){
        this.innerValue /= divider;
    }

    private void leftShift(int shifter){
        this.innerValue <<= shifter;
    }

    private void rightShift(int shifter){
        this.innerValue >>= shifter;
    }
}
