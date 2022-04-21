package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM;

import java.util.Scanner;

public class newQuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a, b, c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a,b,c);

        if(quadratic.getDelta() > 0){
            System.out.printf("Phương trình có 2 ngiệm phân biệt %.3f and %.3f: " , (-b + Math.sqrt(b*b - 4*a*c)/(2*a)) , (-b - Math.sqrt(b*b - 4*a*c)/(2*a)));

        }else
            if(quadratic.getDelta()==0){
                System.out.println("Phương trình có ngiệm kép: " + (-b / 2*a));
            }
            else {
                System.out.println("Phương trình vô ngiệm: ");
            }

    }
}
