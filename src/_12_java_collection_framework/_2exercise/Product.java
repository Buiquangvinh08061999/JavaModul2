package _12_java_collection_framework._2exercise;

public class Product_demo {
    private int id;
    private String name;
    private double price;

    public Product_demo(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product_1[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ']';
    }
}
