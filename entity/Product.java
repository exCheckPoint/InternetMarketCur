package com.boot.internetmarket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/**
 * Created by Admin on 02.06.2017.
 */
@Entity
@Table(name = "product")
public class Product {
// Товари (Код товару, Назва, Ціна, Одиниця виміру)

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Column(name = "name")
    @Getter @Setter
    private String name;

    @Column(name = "price")
    @Getter @Setter
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId() +
                ", name='" + getName() +
                ", price='" + getPrice() +
                '}';
    }
}
