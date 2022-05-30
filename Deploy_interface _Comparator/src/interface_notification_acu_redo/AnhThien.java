package interface_notification_acu_redo;

public class AnhThien implements CongDan{
    @Override
    public void update(String thongbao) {
        System.out.println("Anh Thiện " + thongbao);
    }
}
