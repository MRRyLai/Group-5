package com.example.group5;

public class AlbumItem {
    private int imgResId;
    private String store_name;
    private String address;

    public AlbumItem(int imgResId, String store_name, String address) {
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
