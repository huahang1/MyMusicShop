package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanghua on 4/19/17.
 */
public class ProductDao {
    private List<Product> productList;

    public List<Product> getProductList(){
        Product product1 = new Product();

        product1.setProductId("1");
        product1.setProductName("Guitar");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("this is a fancy guitar");
        product1.setProductPrice(1200);
        product1.setProductCondition("new");
        product1.setProductStatus("Active");
        product1.setUnitInStock(11);
        product1.setProductManufacturers("Fender");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Record1");
        product2.setProductCategory("Record");
        product2.setProductDescription("this is a fancy record");
        product2.setProductPrice(25);
        product2.setProductCondition("new");
        product2.setProductStatus("Active");
        product2.setUnitInStock(30);
        product2.setProductManufacturers("RMI");

        Product product3 = new Product();
        product3.setProductId("3");
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("this is a fancy sepaker");
        product3.setProductPrice(300);
        product3.setProductCondition("new");
        product3.setProductStatus("Active");
        product3.setUnitInStock(20);
        product3.setProductManufacturers("Bose");

        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }

    public Product getProductById(String productId) throws IOException{
        for(Product product:getProductList()){
            if(product.getProductId().equals(productId)){
                return product;
            }
        }

        throw new IOException("No such product found");
    }
}
