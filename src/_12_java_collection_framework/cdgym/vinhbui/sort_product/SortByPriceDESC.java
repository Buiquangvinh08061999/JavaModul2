package _12_java_collection_framework.cdgym.vinhbui.sort_product;

import _12_java_collection_framework.cdgym.vinhbui.model.Product;

import java.util.Comparator;

public class SortByPriceDESC implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        double result = o2.getPrice() - o1.getPrice();
        if(result > 0){
            return 1;
        }else if(result < 0){
            return -1;
        }
        return 0;
    }
}
