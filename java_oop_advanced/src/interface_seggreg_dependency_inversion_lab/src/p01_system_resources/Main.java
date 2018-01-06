package interface_seggreg_dependency_inversion_lab.src.p01_system_resources;

public class Main {
    public static void main(String[] args) {
        TimeProvider localtime = new TestTime();
        Writer writer = new ConsoleWriter();
        GreetingClock greetingClock = new GreetingClock(localtime, writer);
        greetingClock.greeting();

    }
}
