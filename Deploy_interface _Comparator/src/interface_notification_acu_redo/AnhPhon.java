package interface_notification_acu_redo;

public class AnhPhon implements CongDan{
    @Override
    public void update(String thongbao) {
        System.out.println("Anh Phôn " + thongbao);
    }
}
