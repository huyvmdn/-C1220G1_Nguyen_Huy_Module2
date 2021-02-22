package _08_abstract_interface.bai_tap;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[3];
        shapes[0] = new Circle(3.5, "indigo", false);
        shapes [1] = new Rectangle(2.5, 3.8, "orange", true);
        shapes [2] = new Square(5.8, "yellow", true);
        for (byte i=0;i<shapes.length;i++) {
            double a= shapes[i].getArea();
            System.out.println(a);
            if(shapes[i] instanceof Square){
                ((Square)shapes[i]).howToColor();
            }
        }
    }
}
interface IColorable {
    default void howToColor(){};

}
