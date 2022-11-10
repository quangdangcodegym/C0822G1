package com.codegym.services;

import com.codegym.model.Product;
import com.codegym.utils.DateUtils;
import com.codegym.utils.FileUtils;
import com.codegym.utils.Helper;
import com.sun.javafx.css.Combinator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class ProductService {
    private static final String PRODUCT_FILE = "D:\\CODEGYM\\CODEGYM\\Module2\\C0822G1\\shop-template\\data\\product.txt";

    public ProductService() {
    }


    public List<Product> getProducts() {
        List<Product> listProduct = new ArrayList<>();
        List<String> listProductLines = FileUtils.readFile(PRODUCT_FILE);
        for (String item : listProductLines) {
            // item: 1668046363,Iphone 13,12000.0,2,Apple,11-10-2022 09:12:52,11-10-2022 09:12:52
            String[] items = item.split(",");
            Long idProduct = Long.parseLong(items[0]);
            String nameProduct = items[1];
            float priceProduct = Float.parseFloat(items[2]);
            int quantityProduct = Integer.parseInt(items[3]);
            int idManufacturorProduct = Integer.parseInt(items[4]);
            Date createAtProduct = DateUtils.parseStringToDate(items[5]);
            Instant updateAtProduct = DateUtils.parseStringToInstant(items[6]);

            Product product = new Product(idProduct, nameProduct, priceProduct, quantityProduct, Helper.findById(idManufacturorProduct), createAtProduct, updateAtProduct);
            listProduct.add(product);
        }
        return listProduct;
    }
    public List<String> convertProductsToListString(List<Product> products) {
        List<String> listLineProducts = new ArrayList<>();
        for (Product p : products) {
            listLineProducts.add(p.toString());
        }
        return  listLineProducts;
    }

    public void addProduct(Product product) {
        List<String> listProductLines = FileUtils.readFile(PRODUCT_FILE);
        listProductLines.add(product.toString());
        FileUtils.writeFile(listProductLines, PRODUCT_FILE);
    }

    public Product getProductById(Long id) {
        List<Product> products = getProducts();
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void removeProduct(Product product) {
        List<Product> products = getProducts();
        for (Product p : products) {
            if (p.getId().equals(product.getId())) {
                products.remove(p);
                break;
            }
        }
        FileUtils.writeFile(convertProductsToListString(products), PRODUCT_FILE);

    }

    public void removeProductById(Long idProduct) {
        List<Product> products = getProducts();
        for (Product p : products) {
            if (p.getId().equals(idProduct)) {
                products.remove(p);
                break;
            }
        }
        FileUtils.writeFile(convertProductsToListString(products), PRODUCT_FILE);
    }



    public List<Product> searchByName(String name) {
        ArrayList<Product> results = new ArrayList<>();
        for (Product p : getProducts()) {
            if (p.getName().toUpperCase().contains(name.toUpperCase())) {
                results.add(p);
            }
        }
        return results;
    }

    public void sortByName(Comparator<Product> comparatorName) {
        getProducts().sort(comparatorName);
    }
    public void sortByPrice(Comparator<Product> comparatorPrice) {
        getProducts().sort(comparatorPrice);
    }
    public void sortProduct(Comparator<Product> comparator) {
        getProducts().sort(comparator);
    }

}
