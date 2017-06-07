package com.boot.internetmarket.service.interfaces;

import com.boot.internetmarket.entity.Product;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
public interface IProductService {
    void save(Product product);

    void update(Product product);

    void delete(long id);

    List<Product> getAll();

    Product getProduct(long id);
}
