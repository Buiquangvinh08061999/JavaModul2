package LearnJaVa.OOPBasic.BookManagement;

public class TacGia {
    private String tenTacGia;
    private MyDaTe ngaySinh;

    public TacGia(String tenTacGia, MyDaTe ngaySinh){
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia(){
        return this.tenTacGia;
    }
    public void  setTenTacGia(String tenTacGia){
         this.tenTacGia = tenTacGia;
    }


    public MyDaTe getNgaySinh(){
        return this.ngaySinh;
    }
    public void  setNgaySinh(MyDaTe ngaySinh){
        this.ngaySinh = ngaySinh;
    }
}
