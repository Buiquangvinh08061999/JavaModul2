package interface_notification_acu_redo;

public class Main {
    public static void main(String[] args) {
        BuuDien buuDien = new BuuDien();

        CongDan congDan = new AnhThien();
        buuDien.addCongDan(congDan);

        CongDan congDan1 = new AnhPhon();
        buuDien.addCongDan(congDan1);

        buuDien.newThongBao();
        buuDien.thongbaoCongDan();
    }
}
