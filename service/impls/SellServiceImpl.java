package com.boot.internetmarket.service.impls;

import com.boot.internetmarket.entity.Sell;
import com.boot.internetmarket.repositories.SellRepository;
import com.boot.internetmarket.service.interfaces.ISellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@Service
public class SellServiceImpl implements ISellService {

    @Autowired
    private SellRepository sellRepository;

    @Override
    public void save(Sell sell){
        sellRepository.saveAndFlush(sell);
    }

    @Override
    public void update(Sell sell){
        sellRepository.saveAndFlush(sell);
    }

    @Override
    public void delete(long id){
        sellRepository.deleteById(id);
    }

    @Override
    public List<Sell> getAll(){
        return sellRepository.findAll();
    }

    @Override
    public Sell getSell(long id){
        return sellRepository.getOne(id);
    }
}
