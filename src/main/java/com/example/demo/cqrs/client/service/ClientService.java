package com.example.demo.cqrs.client.service;

import com.example.demo.cqrs.client.model.Client;
import com.example.demo.cqrs.client.model.ClientDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface ClientService {

    void add(ClientDto clientDto);

    void update(ClientDto clientDto);

    void delete(UUID clientId);

    Client getByid(UUID clientid);

    List<Client> getAllClients();
}
