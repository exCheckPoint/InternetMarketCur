package com.boot.internetmarket.service.interfaces;

import com.boot.internetmarket.entity.Client;

import java.util.List;

/**
 * Created by Admin on 02.06.2017.
 */
public interface IClientService {
    void save(Client client);

    void delete(long id);

    void update(Client client);

    List<Client> getAll();

    Client getClient(long id);

    int getSizeListClient();

    void getEmailCilentOnId(long id);

    void getAddressClientOnSurnameAndName(String surname, String name);

    List<String> getAllListForNumberPhoneClient();

    List<String> getAllListForEmailClient();
}
