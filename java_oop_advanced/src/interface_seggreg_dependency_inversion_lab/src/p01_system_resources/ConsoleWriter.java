package interface_seggreg_dependency_inversion_lab.src.p01_system_resources;

public class ConsoleWriter implements Writer{
    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
