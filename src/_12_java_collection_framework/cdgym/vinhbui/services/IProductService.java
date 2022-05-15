package _12_java_collection_framework.cdgym.vinhbui.services;

import _12_java_collection_framework.cdgym.vinhbui.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void add(Product newProduct);

    void update(Product newProduct);

    boolean exitsByID(int id);

    Product searchProductById(int id);

    void removeProductByID(int id);

    Product searchName(String name);

    boolean exitsByName(String name);

    List<Product> searchProductByName(String name);

    List<Product>  findAllByPriceDESC();

    List<Product> findAllByPriceASC();
}
