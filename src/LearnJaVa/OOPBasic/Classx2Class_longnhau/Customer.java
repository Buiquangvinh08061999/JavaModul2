package LearnJaVa.OOPBasic.Classx2Class_longnhau;

public class Customer {
    private  int id;
    private  String fullName;
    Address address;

    public Customer(int id, String fullName, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        //Lớp cha truy xuất đén lớp con và truyền vào tham số cho nó
        Address.Location location = new Address.Location(255.20,311.322);
        System.out.println(location);

        //Lớp cha (khai giá trị vào)
        Address address = new Address("28","Nguyen Tri Phuong","Huế", location);
        System.out.println(address);


        //Tạo lớp Ông to Customer, đã nhận các giá trị address có, và khởi tạo nó.
        Customer customer = new Customer(1,"Quang Vinh" , address);
        System.out.println(customer);

    }
}
