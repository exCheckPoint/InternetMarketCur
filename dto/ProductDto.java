package com.boot.internetmarket.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 06.06.2017.
 */
public class ProductDto {
    // Товари (Код товару, Назва, Ціна)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private int price;

}
