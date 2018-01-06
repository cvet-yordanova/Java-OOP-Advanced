package interfaces_exc.d_telephony;

public class Smartphone implements Browsable, Callable{

    @Override
    public void browse(String url) {
        System.out.println("Browsing: "+url+"!");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling... "+number);
    }
}
