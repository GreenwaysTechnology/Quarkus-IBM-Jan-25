package com.ibm.apicomposor.order;

//public class Order {
//    public String orderId;
//    public String productName;
//    public double price;
//
//    public Order() {
//    }
//
//    public Order(String orderId, String productName, double price) {
//        this.orderId = orderId;
//        this.productName = productName;
//        this.price = price;
//    }
//
//    public String getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public void setProductName(String productName) {
//        this.productName = productName;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return "Order{" +
//                "orderId='" + orderId + '\'' +
//                ", productName='" + productName + '\'' +
//                ", price=" + price +
//                '}';
//    }
//}

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order extends PanacheEntity {
    public Long userId;
    public String productName;
    public double price;
}
