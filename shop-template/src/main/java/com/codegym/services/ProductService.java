package com.codegym.services;

import com.codegym.model.Product;
import com.sun.javafx.css.Combinator;

import java.time.Instant;
import java.util.*;

public class ProductService {
    private static ArrayList<Product> products;

    public ProductService() {
    }
    public static void init() {
        products = new ArrayList<>();
        Date createAt = new Date();
        Instant updateAt = Instant.now();

        products.add(new Product(1667182235L, "Zphone 11", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182236L, "Bphone 12", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182237L, "Aphone 13", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182238L, "Ephone 14", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182239L, "Lphone X", 20000, 2, "Apple",createAt, updateAt ));

    }
    static {
        products = new ArrayList<>();
        Date createAt = new Date();
        Instant updateAt = Instant.now();

        products.add(new Product(1667182235L, "Zphone 11", 20000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182236L, "Bphone 12", 80000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182237L, "Aphone 13", 40000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182238L, "Ephone 14", 100000, 2, "Apple",createAt, updateAt ));
        products.add(new Product(1667182239L, "Lphone X", 10000, 2, "Apple",createAt, updateAt ));

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        ProductService.products.add(product);
    }

    public Product getProductById(Long id) {
        for (Product p : ProductService.products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        ProductService.products.remove(product);
    }

    public void removeProductById(Long idProduct) {
        for (int i = 0; i < ProductService.products.size(); i++) {
            if (ProductService.products.get(i).getId().equals(idProduct)) {
                ProductService.products.remove(i);
                break;

            }
        }
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public List<Product> searchByName(String name) {
        ArrayList<Product> results = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().toUpperCase().contains(name.toUpperCase())) {
                results.add(p);
            }
        }
        return results;
    }

    public void sortByName(Comparator<Product> comparatorName) {
        products.sort(comparatorName);
    }
    public void sortByPrice(Comparator<Product> comparatorPrice) {
        products.sort(comparatorPrice);
    }
    public void sortProduct(Comparator<Product> comparator) {
        products.sort(comparator);
    }

}
