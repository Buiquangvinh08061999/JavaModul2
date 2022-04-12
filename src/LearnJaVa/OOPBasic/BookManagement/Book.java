package LearnJaVa.OOPBasic.BookManagement;

public class Book {
    //Xây dựng 1 ứng dụng Java quản lý những quyển sách với các thông tin sau.(SÁCH) bao gồm (tên sách,giá bán, năm suất bản, tác giả).(TÁC GIẢ) bao gồm
//thông tin (tên và ngày sinh).(NGÀY SINH) bao gôm các thông tin (ngày tháng và năm);
//Viết các phương thức:
//+In ra màn hình tên của 1 quyển sách;
//+Cho biết quyển sách bất kí có được xuất bản cùng năm với một quyển sách nào đó hay không;
//+Cho biết giá sách sau khi giảm giá x%, x được truyển vào như 1 tham số;
    private String tenSach;
    private double giaBan;
    private int namSuatBan;
    private TacGia tacGia;

    public Book(String tenSach, double giaBan, int namSuatBan, TacGia tacGia) {
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namSuatBan = namSuatBan;
        this.tacGia = tacGia;
    }

    public String getTenSach() {
        return this.tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public double getGiaBan() {
        return this.giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getNamSuatBan() {
        return this.namSuatBan;
    }

    public void setNamSuatBan(int namSuatBan) {
        this.namSuatBan = namSuatBan;
    }

    public TacGia getTacGia() {
        return this.tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    //In tên sách ra,tab mới
    public void inTenSach() {
        System.out.println(this.tenSach);
    }

    //Kiểm tra năm suất bản có trùng không? tab mới.
    public boolean kiemTraCungNamXuatBan(Book bookKhac) {
//        if(this.namSuatBan == bookKhac.namSuatBan){
//            return true;
//        }else{
//            return false;
//        }
          return  this.namSuatBan == bookKhac.namSuatBan;
    }

    //Kiểm tra giá sau khi giảm cho người dùng nhập vào x tham số.(VD x=10%)
    //Công thức: return this.giaBan*(1-x/100); (1 là 100). (100-10/100 = 0,9)
    public double giaSauKhiGiam(double x){
        return this.giaBan*(1-x/100);

    }
}
