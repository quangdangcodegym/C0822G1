package com.codegym.views.product;

import com.codegym.model.EnumManufacturer;
import com.codegym.model.Product;
import com.codegym.utils.Helper;
import com.codegym.utils.ValidatesUtils;

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
        String nameProduct = inputName();


        System.out.println("Input price:");
        Float priceProduct = Float.parseFloat(scanner.nextLine());

        System.out.println("Input quantity:");
        int quantityProduct = Integer.parseInt(scanner.nextLine());

        System.out.println("Manufacturer: ");
        showManufactory();
        int idManufacturer = Integer.parseInt(scanner.nextLine());
        EnumManufacturer enumManufacturer = Helper.findById(idManufacturer);


        Date creatAtProduct = new Date();
        Instant updateAtProduct = Instant.now();

        Product product = new Product(idProduct, nameProduct, priceProduct,
                quantityProduct,enumManufacturer,  creatAtProduct, updateAtProduct);

        productService.addProduct(product);
    }

    private String inputName() {
        System.out.println("P/s: Name start with case sensitive, maximun 10 character");
        boolean check = false;
        String name = "";
        do{
            name = scanner.nextLine();
            check = ValidatesUtils.validateNameProduct(name);
            if (check == false) {
                System.out.println("P/s: Name start with case sensitive, maximun 10 character");
            }
        }while (!check);
        return name;
    }

    public void showManufactory() {
        System.out.println("Press: ");
        for (EnumManufacturer e : EnumManufacturer.values()) {
            System.out.printf("[%s]: %s \n", e.getId(), e.getName());
        }
    }
}
