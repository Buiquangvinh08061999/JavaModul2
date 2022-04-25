package HocNangCaoJava.PhuongThucTrongOPPTEXT;

public class KhongCoBienStatic_SeNTN {
    int count = 0;

    public KhongCoBienStatic_SeNTN(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        KhongCoBienStatic_SeNTN c1 = new KhongCoBienStatic_SeNTN();
        KhongCoBienStatic_SeNTN c2 = new KhongCoBienStatic_SeNTN();
        KhongCoBienStatic_SeNTN c3 = new KhongCoBienStatic_SeNTN();
    }

    /*Không khai báo biến static kết quả sau mỗi lần sẽ reset lại, và nó không nhảy lên*/
    /*Kết quả: 1, 1 ,1 */
    /*Trong ví dụ, chúng ta tạo một biến instance có tên count mà được tăng lên trong constructor. Khi biến instance này lấy bộ nhớ tại thời điểm tạo đối tượng,
    mỗi đối tượng sẽ có bản sao của biến instance đó,
     nếu nó được tăng lên, nó sẽ không phản ánh các đối tượng khác.
     Vì thế mỗi đối tượng sẽ có giá trị 1 trong biến count.*/
}
