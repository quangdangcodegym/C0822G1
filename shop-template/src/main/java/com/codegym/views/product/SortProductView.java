package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.sort.ComparatorByName;
import com.codegym.sort.ComparatorByPrice;

import java.util.Comparator;

public class SortProductView extends ProductTemplate{
    @Override
    public void showBody() {
        System.out.println("SORT PRODUCT VIEW --->");
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by price");
        Comparator<Product> comparator;
        int action = Integer.parseInt(scanner.nextLine());
        switch (action) {
            case 1:
                comparator = new ComparatorByName();
                productService.sortProduct(comparator);
                break;
            case 2:
                comparator = new ComparatorByPrice();
                productService.sortProduct(comparator);
                break;
        }
        showProducts(productService.getProducts());
    }
}
