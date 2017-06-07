package com.boot.internetmarket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Admin on 02.06.2017.
 */
@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Column(name = "idClient")
    @Getter @Setter
    private long idClient;

    @Column(name = "idProduct")
    @Getter @Setter
    private long idProduct;

    @Column(name = "idSell")
    @Getter @Setter
    private long idSell;

    @Override
    public String toString() {
        return "Bill{" +
                ", id=" + getId() +
               // client.toString()+product.toString()+sell.toString()+
                '}';
    }
}
