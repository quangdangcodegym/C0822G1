package com.codegym.views.product;

import com.codegym.model.Product;
import com.codegym.services.ProductService;
import com.codegym.utils.LogUtils;
import com.codegym.views.ViewTemplate;

public class ProductsView extends ProductTemplate {
    public ProductsView(){

    }

    @Override
    public void showBody() {
        LogUtils.my_log.logger.info("Vao ham showbody ProductsView");
        showProducts(productService.getProducts());
    }
}
