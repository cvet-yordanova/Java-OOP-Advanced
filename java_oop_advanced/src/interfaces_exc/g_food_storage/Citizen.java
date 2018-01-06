package interfaces_exc.g_food_storage;

public class Citizen implements Identifiable, Buyer {
    private String name;
    private Integer age;
    private String number;
    private String id;
    private Integer food;

    public Citizen(String name, Integer age,String number,  String id) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.id = id;
        this.food = 0;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public void buyFood() {
        this.food += 10;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getFood() {
        return this.food;
    }
}
