package interface_notification_acu;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();

        Observer observer = new MailBox();
        postOffice.addObsever(observer);

        Observer observer2 =  new MailBox2();
        postOffice.addObsever(observer2);



        postOffice.newMail();
        postOffice.notifyObserver();
    }
}
