package LearnJaVa.ArrayBasic.ArrayScanner;

import java.util.Scanner;

public class Temperature_conversion {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius toFahrenheit");
            System.out.println("0.Exit");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Nhập Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0) ;
    }

    public static double fahrenheitToCelsius(double f) {
        double celsius = (5.0 / 9) * (f - 32);
        return celsius;
    }

    public static double celsiusToFahrenheit(double c){
        double Fahrenheit = (9.0/5)* (c + 32);
        return  Fahrenheit;
    }

}



