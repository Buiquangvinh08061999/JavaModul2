package Deploy_interface_Colorable;

public class MainColorable {
    public static void main(String[] args) {
        Shape [] shape = new Shape[4];
        shape[0] = new Square(2.5);
        shape[1] = new Rectangle(5.5,6.5);
        shape[2] = new Square(5.5);
        shape[3] = new Rectangle(6.5, 9.5);

        for (Shape item : shape){
            System.out.println(item.toString());
        }
        System.out.println();

        for (Shape item : shape){
            System.out.println(item.toString());
            if(item instanceof Square){
                ((Square) item).howToColor();
            }else {
                ((Rectangle) item).getArea();
            }
        }

    }
}
