package com.boot.internetmarket.controller;

import com.boot.internetmarket.dto.BillDto;
import com.boot.internetmarket.entity.Bill;
import com.boot.internetmarket.service.impls.BillServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@RestController
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private BillServiceImpl billService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseEntity<Bill> saveBill(@RequestBody BillDto billDto){
        Bill bill = new Bill();
        bill.setId(billDto.getId());
        billService.save(bill);
        return new ResponseEntity<Bill>(bill, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public ResponseEntity<Bill> deleteBill(@PathVariable(value = "id")long id){
        billService.delete(id);
        return new ResponseEntity<Bill>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Bill> getAll(){
        return billService.getAll();
    }

    @RequestMapping(value = "/getBill/{id}",method = RequestMethod.GET)
    public Bill getBill(@PathVariable(value = "id") long id){
        return billService.getBill(id);
    }

    @RequestMapping(value = "/toString", method = RequestMethod.GET)
    public String toString(){
        return billService.toString();
    }
  //  @RequestMapping(value = "/showAll/{id}",method = RequestMethod.GET)
    //public String showAll(@PathVariable(value = "id") long id){return billService.showAll(id);}
}
