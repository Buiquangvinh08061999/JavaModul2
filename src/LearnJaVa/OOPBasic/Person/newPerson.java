package LearnJaVa.OOPBasic.Person;


public class newPerson {
    public static void main(String[] args) {
        //Tạo lớp Class: Person, tab mới newPerson gọi lại Person đã được định nghĩa trước đó(bao gồm các thuộc tính của đối tượng Person)
        Person a = new Person(1, "TOp", 21, 2f);
        Person b = new Person(2, "VIP", -21, 2f);
        Person c = new Person(3, "PRO", 21, 2f);
        Person d = new Person(4, "Hay", 21, 2.4f);
        Person f = new Person(5, "VIp", 12, 3f);

        a.getInfo();
        System.out.println("------------");

        //Có thể truy xuất phần tử đơn lẻ theo cách dưới
        //System.out.println(a.ID+ "\n" + a.name +"\n" + a.age+"\n" + a.height );

        b.getInfo();
        System.out.println("------------");

        c.getInfo();
        System.out.println("------------");

        d.getDeMo();
        System.out.println("------------");

        f.getDeMo();


    }
}

