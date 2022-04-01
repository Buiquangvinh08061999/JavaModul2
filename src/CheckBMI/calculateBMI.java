package CheckBMI;

import java.util.Scanner;

public class calculateBMI {
    public static void main(String[] args) {
        double BMI,weight,height;
        Scanner sc =new Scanner(System.in);

        System.out.println("Nhập weight: ");
        weight = sc.nextFloat();

        System.out.println("Nhập height: ");
        height= sc.nextFloat();

        BMI = weight/Math.pow(height, 2);

        if(BMI <18.5){
            System.out.println("Underweight: " + BMI);
        }else if(BMI < 25){
            System.out.println("Normal: " + BMI);
        }else  if (BMI<30){
            System.out.println("Overweight: " + BMI);
        }else {
            System.out.println("Obese"+BMI);
        }





    }
}
