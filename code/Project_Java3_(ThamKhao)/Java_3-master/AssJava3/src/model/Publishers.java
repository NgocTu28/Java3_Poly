package model;

public class Publishers {
    private String pubId;
    private String pubName;
    private String pubAddress;

    public Publishers() {
    }

    public Publishers(String pubId, String pubName, String pubAddress) {
        this.pubId = pubId;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
    }

    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    @Override
    public String toString() {
        return  pubName ;
    }

    
    
}
