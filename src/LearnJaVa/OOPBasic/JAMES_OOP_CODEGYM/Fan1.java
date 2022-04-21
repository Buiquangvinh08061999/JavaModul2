package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

public class Fan1 {
    public final int SLOW =1;
    public final int MEDIUM =2;
    public final int FAST =3;

    private  int speed=SLOW;
    private  boolean on = false;
    private  double radius =5;
    private String color  = "blue";

    public int getSpeed() {
        return speed;
    }
    public boolean isOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Fan1(int speed, boolean on, double radius, String color){
        this.speed =speed;
        this.on = on;
        this.radius= radius;
        this.color= color;
    }


    @Override
    public String toString() {
        if(on){
            return "Speed quạt " + this.speed + "/" + "Color" +this.color + "/" + "Radius"+ this.radius+ "fan is on";
        }
        return "Color" +this.color +"/" + "Radius"+ this.radius+ "/" + "fan is off";
    }

    public static void main(String[] args) {
        Fan1  fan1 = new Fan1(3,true,10,"YELLOW");
        Fan1  fan2 = new Fan1(2,false,5,"BLUE");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
