package enums_and_anotations_lab.c_coffee_machine;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CoffeeMachine cm = new CoffeeMachine();

        while(true){
            String[] line = reader.readLine().split(" ");

            if("end".equalsIgnoreCase(line[0])){
                break;
            }else if(line.length == 1){
                cm.insertCoin(line[0]);
            }else{
                cm.buyCoffee(line[0], line[1]);
            }
        }
        for (Coffee coffee : cm.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
