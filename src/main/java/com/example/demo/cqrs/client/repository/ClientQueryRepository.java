package com.example.demo.cqrs.client.repository;

import com.example.demo.cqrs.client.model.Client;

import java.util.List;
import java.util.UUID;

public interface ClientQueryRepository {

    Client getById(UUID clientId);

    List<Client> getAllClients();
}
