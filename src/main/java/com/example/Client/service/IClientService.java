package com.example.Client.service;

import com.example.Client.entity.Client;
import com.example.Client.entity.Massage;
import com.example.Client.entity.Visit;
import java.util.List;

public interface IClientService {
     List<Client> findAll();
     void save(Client client);
     Client findOne(Long Id);
     void  delete(Long id);
     List<Client> searchClient(String name);

}
