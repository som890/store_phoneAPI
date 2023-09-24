package com.phonestore.phone_store.service;

import com.phonestore.phone_store.dao.ProductDAO;
import com.phonestore.phone_store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;
    public Product addNewProduct(Product product) {
        return productDAO.save(product);
    }
}
