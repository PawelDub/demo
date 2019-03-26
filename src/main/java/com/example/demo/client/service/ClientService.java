package com.example.demo.client.service;

import com.example.demo.client.model.Client;
import com.example.demo.client.model.ClientDto;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    void add(ClientDto clientDto);

    void update(Client client);

    void delete(UUID clientId);

    Client getByid(UUID clientid);

    List<Client> getAllClients();
}
