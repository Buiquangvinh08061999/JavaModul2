package interface_Animal_ACU;

public class Siddeley extends Machine implements Runable,Flyable{
    @Override
    public String enghineSound() {
        return "Siddeley: Rùmmmmmmmmmmmm";
    }

    @Override
    public String howtoFly() {
        return "Siddeley: Đề ba trên mặt đất và phóng lên trời";
    }

    @Override
    public String howtoRun() {
        return "Siddeley: Lướt trên mặt đất! ";
    }
}
