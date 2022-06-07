package com.example.group5;

public class OrderItem {
    private String Order_name;
    private String Status;

    public OrderItem(String store_name, String address) {
        this.Order_name = store_name;
        this.Status = address;
    }

    public String getOrder_name() {
        return Order_name;
    }

    public String getStatus() {
        return Status;
    }
}
