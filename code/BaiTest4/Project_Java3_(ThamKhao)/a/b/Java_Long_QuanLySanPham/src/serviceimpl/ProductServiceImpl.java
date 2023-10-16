/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviceimpl;

import entity.Product;
import java.util.List;
import repository.ProductRepository;
import response.ProductResponse;
import service.IProductService;

/**
 *
 * @author ThinkPad
 */
public class ProductServiceImpl implements IProductService {

    private ProductRepository repo;

    public ProductServiceImpl() {
        repo = new ProductRepository();
    }

    @Override
    public List<ProductResponse> getAllProduct() {
        return repo.getAllProduct();
    }

    @Override
    public boolean isExist(String name) {
        return repo.isExist(name);
    }

    @Override
    public int findIdByNameProduct(String name) {
        return repo.findIdByNameProduct(name);
    }

    @Override
    public List<ProductResponse> findProduct(int mode, String str) {
        return repo.findProduct(mode, str);
    }

    @Override
    public String insertProduct(Product product) {
        return repo.insertProduct(product);
    }

    @Override
    public String updateProduct(Product product) {
        return repo.updateProduct(product);
    }

    @Override
    public String deleteProduct(String id) {
        return repo.deleteProduct(id);
    }

    @Override
    public List<ProductResponse> getAllProductByCategory(String nameCategory) {
        return repo.getAllProductByCategory(nameCategory);
    }

    @Override
    public String updateQuantityProductById(int id, int quantity) {
        return repo.updateQuantityProductById(id, quantity);
    }

}
