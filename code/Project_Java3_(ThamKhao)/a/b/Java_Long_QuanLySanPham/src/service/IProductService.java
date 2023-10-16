/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.Product;
import java.util.List;
import response.ProductResponse;

/**
 *
 * @author ThinkPad
 */
public interface IProductService {

    List<ProductResponse> getAllProduct();

    boolean isExist(String name);

    int findIdByNameProduct(String name);

    List<ProductResponse> findProduct(int mode, String str);

    String insertProduct(Product product);

    String updateProduct(Product product);

    String deleteProduct(String id);

    List<ProductResponse> getAllProductByCategory(String nameCategory);

    String updateQuantityProductById(int id, int quantity);
}
