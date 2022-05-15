package _12_java_collection_framework.cdgym.vinhbui.services;

import _12_java_collection_framework.cdgym.vinhbui.model.Product;
import _12_java_collection_framework.cdgym.vinhbui.sort_product.SortByPriceASC;
import _12_java_collection_framework.cdgym.vinhbui.sort_product.SortByPriceDESC;

import java.util.*;

public class ProductService implements IProductService {
    public  final  List<Product> productList = new ArrayList<>();

    public ProductService() {
        productList.add(new Product(1, "Aa", 100));
        productList.add(new Product(2, "C", 200));
        productList.add(new Product(3, "a", 200));
        productList.add(new Product(4, "Ba", 200));

    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product newProduct) {
        productList.add(newProduct);
    }

    @Override
    public void update(Product newProduct) {

    }


    @Override
    public Product searchProductById(int id) {
        for (Product product : productList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }
    @Override
    public boolean exitsByID(int id) {
        return searchProductById(id) != null;
    }

    @Override
    public void removeProductByID(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.remove(i);
            }
        }
    }

    @Override
    public Product searchName(String name) {
        for (Product product : productList) {
            if(product.getName().contains(name)){
                return product;
            }
        }
        return null;
    }
    @Override
    public boolean exitsByName(String name) {
        return searchName(name) !=null;
    }


    @Override
    public List<Product> searchProductByName(String name) {
        List<Product> searchList = new ArrayList<>();
        for (Product product : productList){
            if (product.getName().contains(name)){
                searchList.add(product);
            }
        }
        return  searchList;
    }

    @Override
    public List<Product> findAllByPriceDESC() {
       List<Product> sortByPrice = new ArrayList<>(productList);
       sortByPrice.sort(new SortByPriceDESC());
       return sortByPrice;
    }

    @Override
    public List<Product> findAllByPriceASC() {
        List<Product> sortByPrice = new ArrayList<>(productList);
        sortByPrice.sort(new SortByPriceASC());
        return sortByPrice;
    }
}
