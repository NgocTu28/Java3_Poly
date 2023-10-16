/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ThinkPad
 */
public class Product {

    private Integer id;
    private Integer categoryId;
    private String productName;
    private Float currentPrice;
    private Integer quantity;

    public Product() {
    }

    public Product(Integer categoryId, String productName, Float currentPrice, Integer quantity) {
        this.categoryId = categoryId;
        this.productName = productName;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    public Product(Integer id, Integer categoryId, String productName, Float currentPrice, Integer quantity) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}
