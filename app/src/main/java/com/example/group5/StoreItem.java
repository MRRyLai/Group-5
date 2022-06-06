package com.example.group5;

public class StoreItem {
    private int imgResId;
    private String store_name;
    private String address;

    public StoreItem(int imgResId, String store_name, String address) {
        this.imgResId = imgResId;
        this.store_name = store_name;
        this.address = address;
    }

    public int getImgResId() {
        return imgResId;
    }

    public String getStore_name() {
        return store_name;
    }

    public String getAddress() {
        return address;
    }

}
