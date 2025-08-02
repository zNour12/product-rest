package com.neznclaude.restapp;

import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ProductService {
    private ArrayList<Product> productList = new ArrayList<>();

    public ArrayList<Product> getAllProducts(){
        return productList;
    }

    public Product getByID(int id){
        return productList.get(id);
    }

    public void addProduct(int id, Product product){
        productList.add(product);
    }

    public void removeProduct(int id){
        productList.remove(id);
    }
}
