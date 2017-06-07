package com.boot.internetmarket.controller;

import com.boot.internetmarket.dto.ProductDto;
import com.boot.internetmarket.entity.Product;
import com.boot.internetmarket.service.impls.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Product> saveProduct(@RequestBody ProductDto productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        productService.save(product);
        return new ResponseEntity<Product>(product, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") long id){
        productService.delete(id);
        return new ResponseEntity<Product>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Product> getAll(){return productService.getAll();}

    @RequestMapping(value = "/getProduct/{id}",method = RequestMethod.GET)
    public Product getProduct(@PathVariable(value = "id")long id){
        return productService.getProduct(id);
    }
}
