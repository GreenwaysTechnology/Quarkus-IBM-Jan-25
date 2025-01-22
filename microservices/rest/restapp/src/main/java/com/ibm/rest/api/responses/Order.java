package com.ibm.rest.api.responses;

public class Order {
    private int id;
    private double orderValue;
    private boolean status;

    public Order() {
    }

    public Order(int id, double orderValue, boolean status) {
        this.id = id;
        this.orderValue = orderValue;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
