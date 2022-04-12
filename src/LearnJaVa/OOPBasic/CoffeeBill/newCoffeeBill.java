package LearnJaVa.OOPBasic.CoffeeBill;

//import LearnJaVa.OOPBasic.CoffeeBill;

public class newCoffeeBill {
    public static void main(String[] args) {
        CoffeeBill cf = new CoffeeBill("TrungNguyên_Coffee", 100000, 1.5);
        CoffeeBill cf1 = new CoffeeBill("SaoMai_Coffee", 200000, 3);

        System.out.println("calculateTotal TrungNguyênCF: " + cf.calculateTotal() +"VNĐ");
        System.out.println("Kiểm tra khối lượng TrungNguyênCF >2kg ?: " + cf.largerWeightCheck(2));
        System.out.println("Kiểm tra tổng tiền TrungNguyênCF > 500k ?: " + cf.totalCheck500k());
        System.out.println("Hóa đơn TrungNguyênCF được giảm là : " + cf.disCount(10) +"VNĐ");
        System.out.println("Tổng tiền sau khi giảm giá là : " + cf.priceAfterDisCount(10) + "VNĐ");

        System.out.println("---------------------------------------------------");


        System.out.println("calculateTotal SaoMaiCF: " + cf1.calculateTotal() +"VNĐ");
        System.out.println("Kiểm tra khối lượng SaoMaiCF >2kg ?: " + cf1.largerWeightCheck(2));
        System.out.println("Kiểm tra tổng tiền SaoMaiCF > 500k ?: " + cf1.totalCheck500k());
        System.out.println("Hóa đơn SaoMaiCF được giảm là : "  + cf1.disCount(10) + "VNĐ");
        System.out.println("Tổng tiền sau khi giảm giá là : " + cf1.priceAfterDisCount(10) + "VNĐ");
    }
}

