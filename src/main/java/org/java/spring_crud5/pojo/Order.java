package org.java.spring_crud5.pojo;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderItem> items;

    public Order() {}

    public Order(Customer customer) {
        
        setCustomer(customer);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public int getFullPrice(boolean includeVat) {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice(includeVat);
        }
        return total;
    }

    @Override
    public String toString() {

        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", items=" + items +
                '}';
    }
}


