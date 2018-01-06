package interfaces_exc.c_ferari;


public class Ferrari implements Car{
    private String model;
    private String driver;

    public Ferrari(String model, String driver) {
        this.model = model;
        this.driver = driver;
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",this.model,this.brakes(), this.gas(), this.driver);
    }
}
