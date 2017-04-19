package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanghua on 4/19/17.
 */
public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();

        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("this is a fancy guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufactures("Fender");

        Product product2 = new Product();
        product2.setProductName("Record1");
        product2.setProductCategory("Record");
        product2.setProductDescription("this is a fancy record");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(30);
        product2.setProductManufactures("RMI");

        Product product3 = new Product();
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("this is a fancy sepaker");
        product3.setProductPrice(300);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(20);
        product3.setProductManufactures("Bose");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }
}
