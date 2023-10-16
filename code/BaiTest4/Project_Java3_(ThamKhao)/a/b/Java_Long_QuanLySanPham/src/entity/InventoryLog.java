/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ThinkPad
 */
public class InventoryLog {

    private Integer id;
    private Integer productId;
    private String iEDate;
    private Integer ioE;
    private Integer quantity;
    private Float price;

    public InventoryLog() {
    }

    public InventoryLog(Integer productId, Integer ioE, Integer quantity, Float price) {
        this.productId = productId;
        this.ioE = ioE;
        this.quantity = quantity;
        this.price = price;
    }

    public InventoryLog(Integer id, Integer productId, String iEDate, Integer ioE, Integer quantity, Float price) {
        this.id = id;
        this.productId = productId;
        this.iEDate = iEDate;
        this.ioE = ioE;
        this.quantity = quantity;
        this.price = price;
    }

    public Object[] todataRow() {
        return new Object[]{id, productId, (ioE == 0) ? "Xuất" : "Nhập", iEDate, quantity, price};
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getiEDate() {
        return iEDate;
    }

    public void setiEDate(String iEDate) {
        this.iEDate = iEDate;
    }

    public Integer getIoE() {
        return ioE;
    }

    public void setIoE(Integer ioE) {
        this.ioE = ioE;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

}
