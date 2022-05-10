package _12_java_collection_framework._2exercise;

import java.util.Comparator;

public class ProductSort implements Comparator<Product_demo> {
    @Override
    public int compare(Product_demo o1, Product_demo o2) {

        double result = o1.getPrice() - o2.getPrice();
        if (result == 0) {
            return o1.getId() - o2.getId();
        }
        if (result > 0)
            return 1;
        return -1;
    }
}
