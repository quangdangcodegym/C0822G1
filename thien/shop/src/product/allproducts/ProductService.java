package product.allproducts;

import product.Product;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ProductService {
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        String str = "";
        for (Product item : products) {
            str += "id: " + item.getId() + ", name: " + item.getName() + ", price: " + item.getPrice() + ",quantity: " +
                item.getQuantity() + ", manufacturer: " + item.getManufacturer() + ", create at: " + item.getCreateAt()
                    + ", update at: " + item.getUpdateAt() + "\n";
        }
        return str;
    }

    public ProductService(){
        init();
    }
    public void init(){
        products = new ArrayList<>();
        Date createAt = new Date();
        Instant updateAt = Instant.now();
        products.add(new Product("sida phone", 100000, 21, "Dong bar", createAt, updateAt));
        products.add(new Product("vjp phone", 110000, 15, "Ancuu", createAt, updateAt));
        products.add(new Product("pr0 phone", 111000, 6, "Cong market", createAt, updateAt));
    }
}
