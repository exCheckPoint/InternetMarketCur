package com.boot.internetmarket.controller;

import com.boot.internetmarket.dto.SellDto;
import com.boot.internetmarket.entity.Sell;
import com.boot.internetmarket.service.impls.SellServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@RestController
@RequestMapping("/sell")
public class SellController {

    @Autowired
    private SellServiceImpl sellService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Sell> saveSell(@RequestBody SellDto sellDto){
        Sell sell = new Sell();
        sell.setDateSell(sellDto.getDateSell());
        sell.setDateReshpmen(sellDto.getDateReshpmen());
        sell.setNumber(sellDto.getNumber());
        sellService.save(sell);
        return new ResponseEntity<Sell>(sell , HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ResponseEntity<Sell> deleteSell(@PathVariable(value = "id") long id){
        sellService.delete(id);
        return new ResponseEntity<Sell>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Sell> getAll(){
        return sellService.getAll();
    }

    @RequestMapping(value = "/getSell/{id}", method = RequestMethod.GET)
    public Sell getSell(@PathVariable(value = "id")long id){
        return sellService.getSell(id);
    }
}
