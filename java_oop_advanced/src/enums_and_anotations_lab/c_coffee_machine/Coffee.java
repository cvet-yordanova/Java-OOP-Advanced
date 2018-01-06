package enums_and_anotations_lab.c_coffee_machine;


public class Coffee {
    private CoffeeType coffeeType;
    private CoffeeSize coffeeSize;

    public Coffee(CoffeeType coffeeType, CoffeeSize coffeeSize) {
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.coffeeSize, this.coffeeType);
    }
}
