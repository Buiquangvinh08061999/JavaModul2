package _12_java_collection_framework._2exercise;

//import java.util.stream.Collector;

import java.util.Comparator;

public class ProductDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double result = o2.getPrice() - o1.getPrice();

        if(result == 0){
            return o2.getId() - o1.getId();
        }
        if (result > 0){
            return 1;
        }
        return -1;
    }
}
