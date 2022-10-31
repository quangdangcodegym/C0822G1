package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.views.ViewTemplate;

public class ProductsView extends ViewTemplate {
    private ProductService productService;
    public ProductsView(){
        productService = new ProductService();
    }

    @Override
    public void showBody() {
        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }
}
