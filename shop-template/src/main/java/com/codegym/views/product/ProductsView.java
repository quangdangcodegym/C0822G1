package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.views.ViewTemplate;

public class ProductsView extends ProductTemplate {
    public ProductsView(){

    }

    @Override
    public void showBody() {
        showProducts(productService.getProducts());
    }
}
