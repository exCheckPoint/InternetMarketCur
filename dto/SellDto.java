package com.boot.internetmarket.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 06.06.2017.
 */
public class SellDto {
    //Продажу (Код продажу, Дата продажу, Дата доставки,Кількість)

    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String dateSell;

    @Getter @Setter
    private String dateReshpmen;

    @Getter @Setter
    private int number;
}
