package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Inheritance_practiceBaiTap;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder( 10);
        System.out.println(cylinder);


        cylinder = new Cylinder(10,"YELOW" , 10);
        System.out.println(cylinder);
    }
}
