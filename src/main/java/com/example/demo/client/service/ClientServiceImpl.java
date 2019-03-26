package com.example.demo.client.service;

import com.example.demo.client.command.DeleteClientCommand;
import com.example.demo.client.command.UpdateClientCommand;
import com.example.demo.client.repository.ClientQueryRepository;
import com.example.demo.cqrses.cgrs.CommandDispatcher;
import com.example.demo.client.command.CreateClientCommand;
import com.example.demo.client.model.Client;
import com.example.demo.client.model.ClientDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    ClientQueryRepository clientQueryRepository;
    CommandDispatcher commandDispatcher;

    @Autowired
    public ClientServiceImpl(ClientQueryRepository clientQueryRepository, CommandDispatcher commandDispatcher) {
        this.clientQueryRepository = clientQueryRepository;
        this.commandDispatcher = commandDispatcher;
    }


    @Override
    public void add(ClientDto clientDto) {
        UUID clientId = UUID.randomUUID();
        Client client = new Client(clientId, clientDto.getName(), clientDto.getSurname(), null, null, null);
        commandDispatcher.dispatch(new CreateClientCommand(client));
    }

    @Override
    public void update(Client client) {
        commandDispatcher.dispatch(new UpdateClientCommand(client));
    }

    @Override
    public void delete(UUID clientId) {
        commandDispatcher.dispatch(new DeleteClientCommand(clientId));
    }

    @Override
    public Client getByid(UUID clientid) {
        return clientQueryRepository.getById(clientid);
    }

    @Override
    public List<Client> getAllClients() {
        return clientQueryRepository.getAllClients();
    }
}
