package app.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    public int orderId;
    public List<Dishes>dishesList;
    public Customer customerId;
    public int noofquantity;


    public Order(int orderId, List<Dishes> dishesList, Customer customerId, int noofquantity) {
        this.orderId = orderId;
        this.dishesList = new ArrayList<>();
        this.customerId = customerId;
        this.noofquantity = noofquantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Dishes> getDishesList() {
        return dishesList;
    }

    public void setDishesList(List<Dishes> dishesList) {
        this.dishesList = dishesList;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public int getNoofquantity() {
        return noofquantity;
    }

    public void setNoofquantity(int noofquantity) {
        this.noofquantity = noofquantity;
    }
}
