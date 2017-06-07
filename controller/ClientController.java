package com.boot.internetmarket.controller;

import com.boot.internetmarket.dto.ClientDto;
import com.boot.internetmarket.entity.Client;
import com.boot.internetmarket.service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ResponseEntity<Client> saveAccount(@RequestBody ClientDto clientDto){
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setSurname(clientDto.getSurname());
        client.setName(clientDto.getName());
        client.setAddress(clientDto.getAddress());
        client.setPhoneNumber(clientDto.getPhoneNumber());
        client.setEmail(clientDto.getEmail());
        clientService.save(client);
        return new ResponseEntity<Client>(client , HttpStatus.CREATED);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public ResponseEntity<Client> deleteAccount(@PathVariable(value = "id")long id){
        clientService.delete(id);
        return new ResponseEntity<Client>(HttpStatus.OK);
    }

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public List<Client> getAll(){return clientService.getAll();}

    @RequestMapping(value = "/getClient/{id}", method = RequestMethod.GET)
    public Client getClient(@PathVariable(value = "id")long id){
        return clientService.getClient(id);
    }

    @RequestMapping(value = "/getSizeListClient",method = RequestMethod.GET)
    public int getSizeListClient(){return clientService.getSizeListClient();}

    @RequestMapping(value = "/getEmailClientOnId/{id}", method = RequestMethod.GET)
    public void getEmailCilentOnId(@PathVariable(value = "id") long id){
         clientService.getEmailCilentOnId(id); }
}
