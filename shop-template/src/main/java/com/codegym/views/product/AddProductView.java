package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.views.ViewTemplate;

import java.time.Instant;
import java.util.Date;

public class AddProductView extends ProductTemplate {

    public AddProductView(){
        super();
    }
    @Override
    public void showBody() {
        System.out.println("--> ADD PRODUCT VIEW");
        Long idProduct = System.currentTimeMillis()/1000;
        System.out.println("Input name:");
        String nameProduct = scanner.nextLine();
        System.out.println("Input price:");
        Float priceProduct = Float.parseFloat(scanner.nextLine());

        System.out.println("Input quantity:");
        int quantityProduct = Integer.parseInt(scanner.nextLine());

        System.out.println("Input manufacturer:");
        String manufacturerProduct = scanner.nextLine();

        Date creatAtProduct = new Date();
        Instant updateAtProduct = Instant.now();

        Product product = new Product(idProduct, nameProduct, priceProduct,
                quantityProduct,manufacturerProduct,  creatAtProduct, updateAtProduct);

        productService.addProduct(product);
    }
}
