package open_close_liskov_principles_lab.a_extends_list.P03_GraphicEditor;

import com.sun.org.apache.regexp.internal.RE;

public class GraphicEditor {
    static void test(Drawable drawable){
        drawable.draw();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        GraphicEditor.test(rectangle);
        GraphicEditor.test(circle);
    }
}
