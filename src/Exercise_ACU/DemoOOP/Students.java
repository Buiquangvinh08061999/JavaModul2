package Exercise_ACU.DemoOOP;

public class Students {
    public  String name;
    public int age;
    public int weight;
    public String address;


    //constructor có tên trùng với class
    public Students(String name, int age,int weight,String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
    }

    public  String getAll(){
        return (name +" lớp C0221K1 " + age +" tuổi " + " cân nặng "+weight +"kg" +" địa chỉ " + address);
    }


    public static void main(String[] args) {
        Students std1 = new Students("Vinh",16,55,"Huế");
        Students std2 = new Students("Phuoc",35,80,"Huế");
        System.out.println(std1.getAll());
        System.out.println(std2.getAll());


    }
}
