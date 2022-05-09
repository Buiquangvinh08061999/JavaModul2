package interface_notification_acu;

public interface Subject {
    void addObsever(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
