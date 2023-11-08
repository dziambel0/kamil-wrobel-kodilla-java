package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice(){
    }

    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }
    @Id
    @GeneratedValue
    @NonNull
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }
    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }
    @OneToMany(targetEntity = Item.class, mappedBy = "invoice", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Item> getItems() {
        return items;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
