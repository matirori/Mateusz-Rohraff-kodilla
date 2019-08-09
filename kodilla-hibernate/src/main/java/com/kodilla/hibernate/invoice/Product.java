package com.kodilla.hibernate.invoice;

import com.sun.istack.internal.NotNull;
import org.omg.CORBA.PRIVATE_MEMBER;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private  Item item;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name = "ID", unique = true)
    private int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    private String getName() {
        return name;
    }

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    public Item getItem() {
        return item;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setItem(Item item) {
        this.item = item;
    }
}
