package com.boot.internetmarket.service.impls;

import com.boot.internetmarket.entity.Product;
import com.boot.internetmarket.repositories.ProductRepository;
import com.boot.internetmarket.service.interfaces.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void save(Product product){
        productRepository.saveAndFlush(product);
    }

    @Override
    public void update(Product product){
         productRepository.saveAndFlush(product);
    }

    @Override
    public void delete(long id){
        productRepository.deleteById(id);
    }

    @Override
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(long id){
        return productRepository.getOne(id);
    }
}
