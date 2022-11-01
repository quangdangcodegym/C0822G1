package com.codegym;

import com.codegym.views.ViewTemplate;
import com.codegym.views.product.AddProductView;
import com.codegym.views.product.DeleteProductView;
import com.codegym.views.product.ProductsView;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        ProductService.init();
        ViewTemplate viewPage = null;
        boolean flagMenu = true;
        do{
            System.out.println("Menu: ");
            System.out.println("1: Add Product");
            System.out.println("2: Show List Product");
            System.out.println("3: Delete Product");

            System.out.println("4: Show List User");
            System.out.println("5: Delete User");
            System.out.println("0: Exit");
            int menu = Integer.parseInt(scanner.nextLine());
            switch (menu) {
                case 1:
                    viewPage = new AddProductView();
                    break;
                case 2:
                    viewPage = new ProductsView();
                    break;
                case 3:
                    viewPage = new DeleteProductView();
                    break;
                case 0:
                    flagMenu = false;
                    break;
            }
            viewPage.showPage();
            //
        }while (flagMenu);

    }

}