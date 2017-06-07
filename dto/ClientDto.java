package com.boot.internetmarket.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Admin on 02.06.2017.
 */
public class ClientDto {
    //Клієнти (Код клієнта, Прізвище, Ім’я, Адреса, Телефон, e-mail, Ознака постійного клієнта).
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String surname;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String address;

    @Getter @Setter
    private String phoneNumber;

    @Getter @Setter
    private String email;

}
