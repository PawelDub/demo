package com.example.demo.cqrs.client.repository;

import com.example.demo.cqrs.client.model.Client;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class ClientCommandRepositoryImpl implements ClientCommandRepository {

    public ClientCommandRepositoryImpl() {
        System.out.println("ClientCommandRepositoryImpl");
    }

    @Override
    public void create(Client client) {
        System.out.println("Command Repository: Create client: " + client.toString());
    }

    @Override
    public void update(Client client) {
        System.out.println("Command Repository: Update client: " + client.toString());
    }

    @Override
    public void delete(UUID clientid) {
        System.out.println("Command Repository: Delete client: " + clientid);
    }
}
