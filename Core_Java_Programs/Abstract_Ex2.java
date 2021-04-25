abstract class Shape{
    abstract void draw();
}
 class rectangle extends Shape{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
 class circle extends Shape{
    void draw()
    {
        System.out.println("drawing circle");
    }
 }
public class AbstractEx2 {
    public static void main(String[] args) {
        Shape s=new circle();
        s.draw();
    }
}