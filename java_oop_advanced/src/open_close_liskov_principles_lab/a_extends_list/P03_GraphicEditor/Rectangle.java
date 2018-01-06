package open_close_liskov_principles_lab.a_extends_list.P03_GraphicEditor;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
