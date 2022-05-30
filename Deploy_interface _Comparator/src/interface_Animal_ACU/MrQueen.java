package interface_Animal_ACU;

public class MrQueen extends Machine implements Runable{
    @Override
    public String enghineSound() {
        return "MrQueen: Lambokini rùuuuuu,";
    }

    @Override
    public String howtoRun() {
        return "MrQueen: Lambokini Đề ba và phóng trên mặt đất ";
    }
}
