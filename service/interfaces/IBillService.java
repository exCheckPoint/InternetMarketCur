package com.boot.internetmarket.service.interfaces;

import com.boot.internetmarket.entity.Bill;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
public interface IBillService {
    void save(Bill bill);

    void update(Bill bill);

    void delete(long id);

    List<Bill> getAll();

    Bill getBill(long id);

    boolean discount();

    double sum();
}
