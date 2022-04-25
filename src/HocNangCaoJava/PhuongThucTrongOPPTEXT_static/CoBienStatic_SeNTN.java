package HocNangCaoJava.PhuongThucTrongOPPTEXT;

public class CoBienStatic_SeNTN {
   static int count = 0;

    public CoBienStatic_SeNTN(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        CoBienStatic_SeNTN c1 = new CoBienStatic_SeNTN();
        CoBienStatic_SeNTN c2 = new CoBienStatic_SeNTN();
        CoBienStatic_SeNTN c3 = new CoBienStatic_SeNTN();

        /*Khai báo static nó sẽ nhận giá trị lại sau mỗi lần thay đổi*/
        /*Như bạn đã thấy ở trên, biến static sẽ lấy bộ nhớ chỉ một lần, nếu bất cứ đối tượng nào thay đổi giá trị của biến static,
         nó sẽ vẫn ghi nhớ giá trị của nó.*/
        /*Kết quả sẽ là : 1  2 3*/
    }
}
