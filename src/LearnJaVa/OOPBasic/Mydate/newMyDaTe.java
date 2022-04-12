package LearnJaVa.OOPBasic.Mydate;

public class newMyDaTe {
    public static void main(String[] args) {
        //Lớp MyDaTe đã được định ngĩa, ta gọi lại để sử dụng, và gán giá trị tương ứng vào
        //Ta đặt tên biến là all,để chọn tất cả thuộc tính ra.
        MyDaTe all = new MyDaTe(8, 06, 1999);
        all.getDay();
        all.getMonth();
        all.getYear();
        all.getAllDay_Month_Year();
    }
}
