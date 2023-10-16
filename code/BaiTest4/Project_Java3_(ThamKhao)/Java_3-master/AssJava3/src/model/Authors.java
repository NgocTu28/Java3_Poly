
package model;

public class Authors {
    private String auId;
    private String auName;
    private String auAddress;

    public Authors() {
    }

    public Authors(String auId, String auName, String auAddress) {
        this.auId = auId;
        this.auName = auName;
        this.auAddress = auAddress;
    }

    public String getAuId() {
        return auId;
    }

    public void setAuId(String auId) {
        this.auId = auId;
    }

    public String getAuName() {
        return auName;
    }

    public void setAuName(String auName) {
        this.auName = auName;
    }

    public String getAuAddress() {
        return auAddress;
    }

    public void setAuAddress(String auAddress) {
        this.auAddress = auAddress;
    }
    
}
