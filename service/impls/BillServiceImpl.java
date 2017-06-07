package com.boot.internetmarket.service.impls;

import com.boot.internetmarket.entity.Bill;
import com.boot.internetmarket.entity.Product;
import com.boot.internetmarket.entity.Sell;
import com.boot.internetmarket.repositories.BillRepository;
import com.boot.internetmarket.service.interfaces.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@Service
public class BillServiceImpl implements IBillService{

    @Autowired
    private BillRepository billRepository;

    @Override
    public void save(Bill bill){
        billRepository.saveAndFlush(bill);
    }

    @Override
    public void update(Bill bill){
        billRepository.saveAndFlush(bill);
    }

    @Override
    public void delete(long id){
        billRepository.deleteById(id);
    }

    @Override
    public List<Bill> getAll(){
        return billRepository.findAll();
    }

    @Override
    public Bill getBill(long id){
        return billRepository.getOne(id);
    }

    @Override
    public boolean discount(){
        Product product = null;
        Sell sell = null;
        if (product.getPrice()*sell.getNumber()>=5000)
            return true;
        else
            return false;
    }

    @Override
    public double sum(){
        Product product = null;
        Sell sell = null;
        if (discount())
            return product.getPrice() * sell.getNumber() * 0.98;
        else
            return product.getPrice()*sell.getNumber();
    }
}
