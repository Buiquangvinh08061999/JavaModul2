package LearnJaVa.OOPBasic.MyDaTetoString;

public class newMyDaTe {
    public static void main(String[] args) {
        MyDaTe md1 = new MyDaTe(8,6, 1999);
        MyDaTe md2 = new MyDaTe(15,5, 1961);
        MyDaTe md3 = new MyDaTe(8,6, 1999);
        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

        //Dùng hàm set để thay đổi thêm một thuộc tính của (md1)
//        md1.setDay(15); md1.setMonth(9); md1.setYear(2001);
//        System.out.println(md1);

        //Dùng hàm equals để so sánh bằng hoặc không. true/false
        System.out.println("md1 có bằng md2 không: " + md1.equals(md2));
        System.out.println("md1 có bằng md3 không: " + md1.equals(md3));


        //Dùng hàm băm(hashCode) để so sánh con số(giá trị đại diện cho đối tượng:39664)
        System.out.println("Hashcode md1: " + md1.hashCode());
        System.out.println("Hashcode md2: " + md2.hashCode());
        System.out.println("Hashcode md3: " + md3.hashCode());
    }
}
