package com.example.demo.cqrs.client.service;

import com.example.demo.cqrs.cgrs.CommandDispatcher;
import com.example.demo.cqrs.client.command.CreateClientCommand;
import com.example.demo.cqrs.client.model.Client;
import com.example.demo.cqrs.client.model.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    CommandDispatcher commandDispatcher;

    @Autowired
    public ClientServiceImpl(CommandDispatcher commandDispatcher) {
        this.commandDispatcher = commandDispatcher;
    }

    @Override
    public void add(ClientDto clientDto) {
        UUID clientId = UUID.randomUUID();
        Client client = new Client(clientId, clientDto.getName(), clientDto.getSurname(), null, null, null);
        commandDispatcher.dispatch(new CreateClientCommand(client));
    }

    @Override
    public void update(ClientDto clientDto) {

    }

    @Override
    public void delete(UUID clientId) {

    }

    @Override
    public Client getByid(UUID clientid) {
        return null;
    }

    @Override
    public List<Client> getAllClients() {
        return null;
    }
}
