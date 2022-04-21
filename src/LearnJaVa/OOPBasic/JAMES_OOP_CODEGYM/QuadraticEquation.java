package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }
    public  QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b= b;
        this.c = c;
    }

    public  double getterA(){
        return a;
    }
    public  double getterB(){
        return b;
    }
    public  double getterC(){
        return b;
    }

    public  double getDelta(){
        //Tạo công thức Delta
        return Math.pow(b, 2) - 4 * a*c;
    }
}
