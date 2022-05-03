package _10_dsa_list.practice.practice_arraylist;

import LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.Overriding_ghidephuongthuc.Animal;

import java.util.*;

public class lean_arraylist_lv1 {
    public static void main(String[] args) {
        /*Level_max(vòng lặp for để duyệt qua Arraylist, và lấy vị trí từng phần tử*/
        ArrayList<String> car1 = new ArrayList<>();
        car1.add("Lambo");
        car1.add("BWM");
        car1.add("Vinfast");
        System.out.println("Car1: " + car1);
        System.out.println("Size: " + car1.size());

        for (int i=0; i< car1.size();i++){
            System.out.print(car1.get(i));
            System.out.print(", ");
        }

        System.out.println("");
        /*Level_max(vòng lặp forEach duyệt qua Arraylist, và lấy vị trí từng phần tử*/
        ArrayList<String> car2 = new ArrayList<>();
        car2.add("Lambo");
        car2.add("BWM");
        car2.add("Vinfast");
        System.out.println("Car2: " + car2);
        System.out.println("Size: " + car2.size());

        for (String car: car2){
            System.out.print(car);
            System.out.print(", ");
        }

        System.out.println("");
        /*Sắp xếp tăng dần theo bảng chữ cái, dùng thư viện Collections, và hàm sort*/
        ArrayList<String> car3 = new ArrayList<>();
        car3.add("Lambo");
        car3.add("BWM");
        car3.add("Vinfast");
        System.out.println("Car3: " + car3);

        Collections.sort(car3);
        System.out.println("Mảng sau khi sắp xếp là: " + car3);




        /*Level_1,hàm get chỉ lấy vị trí index*/
        ArrayList<String> animal = new ArrayList<>();
        animal.add(0,"Dog");
        animal.add(1,"Bird");
        animal.add(2,"Chicken");
//        animal.remove(2);
        String element = animal.get(0);
        System.out.println("Animal: "  + animal);
        System.out.println(element);

        /*Level_2,hàm set để sửa vị trí index*/
        ArrayList<String> Animal = new ArrayList<>();
        Animal.add("Dog");
        Animal.add("Bird");
        Animal.add("Chicken");
        System.out.println("Animal: " + Animal);

        Animal.set(0,"Cat");
        System.out.println("Mảng sau khi sữa index 0 là: " + Animal);

        /*Level_3(Thêm phần tử ArrayList này vào ArrayList khác*/
        ArrayList<String> mammals = new ArrayList<>();
        mammals.add("Dog");
        mammals.add("Ping");
        mammals.add("Cat");
        System.out.println("Mammals: " + mammals);

        ArrayList<String> animal1 = new ArrayList<>();
        animal1.add("Crocodile");

        animal1.addAll(mammals);
        System.out.println("Mảng sau khi thêm là: "+ animal1);

        /*Level_4(sử dụng hàm asList() để khai báo trực tiếp*/
        ArrayList<String> animals = new ArrayList<String>(
                Arrays.asList("Dog","Ping","Cat")
        );
        System.out.println("Animals: " + animals);

        String element1 = animals.get(1);
        System.out.println("Element1: " + element1 );

        ArrayList<String> car = new ArrayList<String>(
                Arrays.asList("Lambo","BWM")
        );
        System.out.println("Car: " + car);


    }
}
