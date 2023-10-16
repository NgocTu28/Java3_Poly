/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package response;

/**
 *
 * @author ThinkPad
 */
public class ProductResponse {

    private Integer id;
    private String categoryName;
    private String productName;
    private Float currentPrice;
    private Integer quantity;

    public ProductResponse() {
    }

    public ProductResponse(Integer id, String categoryName, String productName, Float currentPrice, Integer quantity) {
        this.id = id;
        this.categoryName = categoryName;
        this.productName = productName;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
    }

    public Object[] toDataRow() {
        return new Object[]{id, categoryName, productName, currentPrice, quantity};
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    @Override
    public String toString() {
        return "ProductResponse{" + "id=" + id + ", categoryName=" + categoryName + ", productName=" + productName + ", currentPrice=" + currentPrice + ", quantity=" + quantity + '}';
    }

}
