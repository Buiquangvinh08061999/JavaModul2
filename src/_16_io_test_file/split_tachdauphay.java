package _16_io_test_file;

public class split_tachdauphay {
    public static void main(String[] args) {
        String animal = "Bui,Quang,Vinh,Vip";
        String[]token = animal.split(",");

        for(String element : token){
            System.out.printf(element + " ");
        }
    }
}
