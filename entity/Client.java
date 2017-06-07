package com.boot.internetmarket.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Admin on 02.06.2017.
 */
@Entity
@Table(name = "client")
public class Client {
    //Клієнти (Код клієнта, Прізвище, Ім’я, Адреса, Телефон, e-mail, Ознака
    //      постійного клієнта).

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

    @Column(name = "surname")
    @Getter @Setter
    private String surname;

    @Column(name = "name")
    @Getter @Setter
    private String name;

    @Column(name = "address")
    @Getter @Setter
    private String address;

    @Column(name = "phoneNumber")
    @Getter @Setter
    private String phoneNumber;

    @Column(name = "email")
    @Getter @Setter
    private String email;

    @Override
    public String toString() {
        return "Client{" +
                "id=" + getId() +
                ", surname='" + getSurname() +
                ", name='" + getName() +
                ", address='" + getAddress() +
                ", phoneNumber='" + getPhoneNumber() +
                ", email='" + getEmail() +
                '}';
    }
}
