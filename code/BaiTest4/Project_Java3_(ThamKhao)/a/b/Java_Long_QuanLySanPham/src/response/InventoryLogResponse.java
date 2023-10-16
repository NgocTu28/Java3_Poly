/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package response;

/**
 *
 * @author ThinkPad
 */
public class InventoryLogResponse {

    private Integer id;
    private String productName;
    private String iEDate;
    private Integer ioE;
    private Integer quantity;
    private Float price;

    public InventoryLogResponse() {
    }

    public InventoryLogResponse(Integer id, String productName, String iEDate, Integer ioE, Integer quantity, Float price) {
        this.id = id;
        this.productName = productName;
        this.iEDate = iEDate;
        this.ioE = ioE;
        this.quantity = quantity;
        this.price = price;
    }

    public Object[] todataRow() {
        return new Object[]{id, productName, iEDate, (ioE == 0) ? "Xuất" : "Nhập", quantity, price};
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
