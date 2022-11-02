package com.codegym.views.product;

import com.codegym.model.Product;

import java.util.List;

public class SearchProductView extends ProductTemplate{
    @Override
    public void showBody() {

        System.out.println("Search By Name -->>>");
        String nameSearch = scanner.nextLine();
        List<Product> listProductSearch = productService.searchByName(nameSearch);
        showProducts(listProductSearch);

    }
}
