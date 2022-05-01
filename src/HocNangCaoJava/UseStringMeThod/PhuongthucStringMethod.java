package HocNangCaoJava.UseStringMeThod;

public class PhuongthucStringMethod {
    public static void main(String[] args) {
        String name = "Bui Quang Vinh";
        System.out.println("Name: " + name);
        System.out.println("Lenth: " + name.length()); /* độ dài */
        System.out.println("UpperCase: " + name.toUpperCase()); /*Viết hoa */
        System.out.println("LowerCase: " + name.toLowerCase()); /*Viết thường */
        System.out.println("Char: " + name.charAt(0)); /*Lấy kí tự vị trí [0] */
        System.out.println("SubString:" + name.substring(4, 9));/*Lấy kí từ vị trí[4 đến 9] => Quang*/
    }
}
