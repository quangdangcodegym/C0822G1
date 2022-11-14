package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.views.ViewTemplate;

import java.util.List;

public abstract class ProductTemplate extends ViewTemplate {
    protected ProductService productService;
    public ProductTemplate() {
        productService = new ProductService();
    }
    public void showProducts(List<Product> list) {
        for (Product product : list) {
            System.out.println(product.showInfo());
        }


    }
}
