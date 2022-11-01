package product.productview;

import product.Product;
import product.allproducts.ProductService;
import template.ViewTemplate;

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class AddProductView extends ViewTemplate {
    public Scanner scanner = new Scanner(System.in);
    private ProductService productService;
    public AddProductView(){
        productService = new ProductService();
    }

    @Override
    public void showBody() {
        System.out.println("Add product here:");
        System.out.println("-----------------");
        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter product price:");
        Float productPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter product quantity");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product manufacturer");
        String manu = scanner.nextLine();
        Date createAt = new Date();
        Instant updateAt = Instant.now();
        Product product = new Product(productName, productPrice, quantity, manu, createAt, updateAt);
        productService.getProducts().add(product);
    }
}
