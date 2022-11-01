package product.productview;

import product.Product;
import product.allproducts.ProductService;
import template.ViewTemplate;

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
