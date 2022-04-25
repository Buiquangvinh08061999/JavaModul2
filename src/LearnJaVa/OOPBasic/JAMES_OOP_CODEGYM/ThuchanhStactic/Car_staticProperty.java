package LearnJaVa.OOPBasic.JAMES_OOP_CODEGYM.ThuchanhStactic;

public class Car {
    private String name;
    private String engine;

    public static  int numberOfCars = 2;

    public Car(String name, String engine){
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
        Car car1 = new Car("LamboKini5","1000CC");
        System.out.println(Car.numberOfCars);

        Car car2 = new Car("LamboKini10","2000CC");
        System.out.println(Car.numberOfCars);
    }
    /*In ra 3 & 4,, Khi ta dùng static , nó sẽ nhận giá trị đó, và truyền lên tiếp phương thức khi ta gọi tiếp
     đối tương car3, car4 */
}
