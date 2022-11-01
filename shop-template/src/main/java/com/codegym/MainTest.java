package com.codegym;

import com.codegym.model.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainTest {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products;
    public static void main(String[] args) {
       init();
        // Viết thêm sản phẩm
        addProductView();
        showProductsView();

    }

    private static void init() {
        Date createAt = new Date();
        Instant updateAt = Instant.now();
        products = new ArrayList<>();
        products.add(new Product(1667182235L, "Iphone 11", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182236L, "Iphone 12", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182237L, "Iphone 13", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182238L, "Iphone 14", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182239L, "Iphone X", 20000, 2, "Apple",createAt, updateAt ));

    }

    public static void addProductView(){
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

        products.add(product);

    }

    public static void showProductsView(){
        for (Product product: products) {
            System.out.println(product);
        }
    }


}
