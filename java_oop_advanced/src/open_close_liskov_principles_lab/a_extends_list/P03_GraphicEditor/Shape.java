package open_close_liskov_principles_lab.a_extends_list.P03_GraphicEditor;

public class Shape implements Drawable{

    @Override
    public void draw() {
        System.out.println("Shape");
    }
}
