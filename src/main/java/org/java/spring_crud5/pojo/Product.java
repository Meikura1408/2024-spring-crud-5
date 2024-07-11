package org.java.spring_crud5.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int vat;

    public Product() {}

    public Product(String name, int price, int vat) {
        setName(name);
        setPrice(price);
        setVat(vat);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getVat() {
        return vat;
    }

    public int getFullPrice(boolean includeVat) {
        if (includeVat) {
            return price + (price * vat / 100);
        } else {
            return price;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", vat=" + vat +
                '}';
    }
}

