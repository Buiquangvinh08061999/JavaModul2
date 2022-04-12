package LearnJaVa.OOPBasic.BookManagement;

public class TextALL {
    public static void main(String[] args) {
        MyDaTe ngay1 = new MyDaTe(15,5,1961);
        MyDaTe ngay2 = new MyDaTe(5,1,1961);

        TacGia tacGia1 = new TacGia("Bùi Quang Vinh", ngay1);
        TacGia tacGia2 = new TacGia("Quang Tốp", ngay2);

        Book book1 =new Book("Lập trình Java",10000,2022,tacGia1);
        Book book2 =new Book("Lập trình Java1",20000,2025,tacGia2);

        //Sử dụng để in ra tên sách.
        book1.inTenSach();
        book2.inTenSach();

        //Kiểm tra NSB của sách 1 và sách 3; đã có công thức
        System.out.println("SoSanh NSB sách 1 và sách 3 là:"+ book1.kiemTraCungNamXuatBan(book2));

        //Kiểm tra giá bán sau khi giảm, đã có công thức áp dụng rất hay;
        System.out.println("Book1 giảm 10%: "+ book1.giaSauKhiGiam(10));
        System.out.println("Book2 giảm 50%: "+ book2.giaSauKhiGiam(50));
    }
}
