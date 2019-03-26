package com.example.demo.client.repository;

import com.example.demo.client.model.Client;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Repository
public class ClientQueryRepositoryImpl implements ClientQueryRepository {

    @Override
    public Client getById(UUID clientId) {
        Client client = new Client(clientId, "Franek", "Kimono", 36, 87.2, 1.78);
        System.out.println("Query Repository: get client by id : " + client.toString());
        return client;
    }

    @Override
    public List<Client> getAllClients() {
        List<Client> clients = Arrays.asList(new Client(UUID.randomUUID(), "Franek", "Kimmono", 36, 87.2, 1.78), new Client(UUID.randomUUID(), "Leszek", "Leszczyński", 42, 114.2, 1.56));
        System.out.println("Query Repository: get all clients : " + clients.toString());
        return clients;
    }
}
