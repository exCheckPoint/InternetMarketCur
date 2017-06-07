package com.boot.internetmarket.service.impls;

import com.boot.internetmarket.entity.Client;
import com.boot.internetmarket.repositories.ClientRepository;
import com.boot.internetmarket.service.interfaces.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void save(Client client){
         clientRepository.saveAndFlush(client);
    }

    @Override
    public void delete(long id){
        clientRepository.deleteById(id);
    }

    @Override
    public void update(Client client){
         clientRepository.saveAndFlush(client);
    }

    @Override
    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    @Override
    public Client getClient(long id){
        return clientRepository.getOne(id);
    }

    @Override
    public int getSizeListClient(){
        return clientRepository.findAll().size();
    }

    @Override
    public void getEmailCilentOnId(long id){
        for (Client client:clientRepository.findAll()){
            if(client.getId()== id){
                System.out.println("Client Id:"+id+", have email:"+client.getEmail()+".");
            }
        }

    }

    @Override
    public void getAddressClientOnSurnameAndName(String surname, String name){
        for (Client client:clientRepository.findAll()){
            if (client.getSurname().equals(surname)&&client.getName().equals(name)){
                System.out.println("Client: "+surname+name+" has as adress: "+client.getAddress());
            }
        }
    }

    @Override
    public List<String> getAllListForNumberPhoneClient(){
        ArrayList<String> phoneNumberList=new ArrayList<>();
        for (Client client : clientRepository.findAll()){
            phoneNumberList.add(client.getPhoneNumber());
        }
        return phoneNumberList;
    }

    @Override
    public List<String> getAllListForEmailClient(){
        ArrayList<String> emailList=new ArrayList<>();
        for(Client client : clientRepository.findAll()){
            emailList.add(client.getEmail());
        }
        return emailList;
    }
}