package interface_notification_acu;
import java.util.*;
public class PostOffice implements Subject{
    public String address;

    List<Observer> list = new ArrayList<>();

    @Override
    public void addObsever(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list){
            observer.updata(address);
        }
    }
    public void newMail(){
        address ="from: 24 Nguyen Tri Phuong";
    }
}
