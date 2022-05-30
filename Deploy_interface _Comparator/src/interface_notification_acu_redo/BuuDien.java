package interface_notification_acu_redo;

import java.util.ArrayList;
import java.util.List;

public class BuuDien implements NhaDai{

    public String thongbao;
    List<CongDan> listCongDan = new ArrayList<>();

    @Override
    public void addCongDan(CongDan congDan) {
        listCongDan.add(congDan);
    }

    @Override
    public void removeCongDan(CongDan congdan) {
        listCongDan.remove(congdan);
    }

    @Override
    public void thongbaoCongDan() {
        for (CongDan element: listCongDan ){
            element.update(thongbao);
        }
    }

    public void newThongBao(){
        thongbao = "Anh em tập hợp làm trận banh";
    }

}
