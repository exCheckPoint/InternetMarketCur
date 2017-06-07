package com.boot.internetmarket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Admin on 02.06.2017.
 */
@Entity
@Table(name = "sell")
public class Sell {
    //Продажу (Код продажу, Дата продажу, Дата доставки,Кількість)

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long  id;

    @Column(name = "dateSell")
    @Getter @Setter
    private String dateSell;

    @Column(name = "dateReshpmen")
    @Getter @Setter
    private String dateReshpmen;

    @Column(name = "number")
    @Getter @Setter
    private int number;

    @Override
    public String toString() {
        return "Sell{" +
                "id=" + getId() +
                ", dateSell='" + getDateSell() +
                ", dateReshpmen='" + getDateReshpmen() +
                ", number=" + getNumber() +
                '}';
    }
}
