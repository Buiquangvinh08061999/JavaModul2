package interface_notification_acu;

public class MailBox2 implements Observer{
    @Override
    public void updata(String address) {
        System.out.println("Người nhận mail 2 " + address);
    }
}
