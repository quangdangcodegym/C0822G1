package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.views.ViewTemplate;

import java.util.List;
import java.util.Scanner;

public class DeleteProductView extends ProductTemplate {

    public DeleteProductView() {
       super();
    }

    @Override
    public void showBody() {
        System.out.println("DELETE PRODUCT VIEW");
        showProducts(productService.getProducts());
        System.out.println("Input ID:");
        Long idProduct = Long.parseLong(scanner.nextLine());
        productService.removeProductById(idProduct);
        showProducts(productService.getProducts());
    }


}
