package interfaces_exc.d_telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static Boolean checkForNumbers(String number){
        Boolean foundDigit = false;

        for (int i = 0; i < number.length(); i++) {
            if(Character.isDigit(number.charAt(i))){
                foundDigit = true;
            }
        }

        return foundDigit;
    }

    public static Boolean checkForChars(String number){
        Boolean foundChar = false;

        for (int i = 0; i < number.length(); i++) {
            if(!Character.isDigit(number.charAt(i))){
                foundChar = true;
            }
        }

        return foundChar;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = reader.readLine().split("\\s+");
        String[] urls = reader.readLine().split("\\s+");

        Smartphone phone = new Smartphone();

        for (String number : numbers) {
            if(!checkForChars(number)){
            phone.call(number);}
            else{
                System.out.println("Invalid number!");
            }
        }

        for (String url : urls) {
            if(!checkForNumbers(url)){
                phone.browse(url);
            }else{
                System.out.println("Invalid URL!");
            }
        }
    }
}
