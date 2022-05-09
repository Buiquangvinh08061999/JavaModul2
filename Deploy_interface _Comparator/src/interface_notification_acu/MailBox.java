package interface_notification_acu;

public class MailBox implements Observer{

    @Override
    public void updata(String thongbao) {
        System.out.println("Người nhận mail1 " + thongbao);
    }
}
