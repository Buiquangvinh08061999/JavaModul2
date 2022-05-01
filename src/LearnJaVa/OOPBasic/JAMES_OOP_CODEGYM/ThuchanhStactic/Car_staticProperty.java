package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class Car_staticProperty {
    private String name;
    private String engine;

    public static  int numberOfCars = 2;

    public Car_staticProperty(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static void main(String[] args) {
        Car_staticProperty car1 = new Car_staticProperty("LamboKini5","1000CC");
        System.out.println(Car_staticProperty.numberOfCars);

        Car_staticProperty car2 = new Car_staticProperty("LamboKini10","2000CC");
        System.out.println(Car_staticProperty.numberOfCars);
    }
    /*In ra 3 & 4,, Khi ta dùng static , nó sẽ nhận giá trị đó, và truyền lên tiếp phương thức khi ta gọi tiếp
     đối tương car3, car4 */
}
