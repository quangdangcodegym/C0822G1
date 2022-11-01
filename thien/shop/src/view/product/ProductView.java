package view.product;

import product.Product;
import product.ProductService;
import view.ViewTemplate;

public class ProductView extends ViewTemplate {
    private ProductService productService;
    public ProductView(){
        productService = new ProductService();
    }

    @Override
    public void showBody() {
        for (Product product : productService.getProducts()) {
            System.out.println(product);
        }
    }
}
