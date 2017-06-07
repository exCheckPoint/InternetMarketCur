package com.boot.internetmarket.service.interfaces;

import com.boot.internetmarket.entity.Sell;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
public interface ISellService {
    void save(Sell sell);

    void update(Sell sell);

    void delete(long id);

    List<Sell> getAll();

    Sell getSell(long id);
}
