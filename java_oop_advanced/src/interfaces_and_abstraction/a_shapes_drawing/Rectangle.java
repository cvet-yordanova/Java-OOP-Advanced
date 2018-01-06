package interfaces_and_abstraction.a_shapes_drawing;


public class Rectangle implements Drawable{

    private Integer height;
    private Integer width;

    public Rectangle(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        drawLine(this.width, '*', '*');
        for (int i = 1; i < this.height - 1; ++i)
            drawLine(this.width, '*', ' ');
        drawLine(this.width, '*', '*');

    }
    private void drawLine(int width, char end, char mid){
        System.out.print(end);
        for (int i = 1; i < width - 1; ++i)
            System.out.print(mid);
        System.out.println(end);
    }

}
