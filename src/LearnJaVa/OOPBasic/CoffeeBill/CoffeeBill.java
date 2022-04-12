package LearnJaVa.OOPBasic.CoffeeBill;

public class CoffeeBill {
    //Bài tập Hóa Đơn Cà Phê Nâng cao logic.
    private String coffeeName;
    private double coffeePrice1kg;
    private double coffeeWeight;

    public  CoffeeBill(String name, double Price1kg, double Weight) {
        this.coffeeName = name;
        this.coffeePrice1kg = Price1kg;
        this.coffeeWeight = Weight;
    }

    public double calculateTotal(){
//      Tính tổng tiền: lấy giá 1kg * khối lượng
        return this.coffeePrice1kg * this.coffeeWeight;
    }

    public  boolean largerWeightCheck(double Weight){
//        Kiểm tra khối lượng nhập vào , có lơn hơn số hiện tại hay không; Có 2 cách kiểm tra
//        if(this.coffeeWeight > Weight){
//            return  true;
//        }else {
//            return false;
//        }
        return this.coffeeWeight > Weight;
    }

    public boolean totalCheck500k(){
//      Kiểm tra tổng tiền có lơn hơn 500.000 hay không, gọi lại hàm tính tổng this.calculateTotal() đã
//      làm ở trên;
        return this.calculateTotal() > 500000;
    }

    public double disCount(double x){
//      Tính số tiền giảm giá, giảm x% cho hóa đơn >500.000
//      Công thức tính tiền lãi (x/100)* this.calculateTotal()
        if(this.calculateTotal() >500000){
            return (x/100)* this.calculateTotal();
        }else {
            return 0;
        }
    }

    public double priceAfterDisCount(double x){
//       Tính số tiền khách phải trả sau khi giảm giá
        return  this.calculateTotal() - this.disCount(x);

    }


}
