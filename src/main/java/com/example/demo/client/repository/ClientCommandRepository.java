package com.example.demo.client.repository;

import com.example.demo.client.model.Client;

import java.util.UUID;

public interface ClientCommandRepository {

    void create(Client client);

    void update(Client client);

    void delete(UUID clientid);

}
