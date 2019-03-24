package com.example.demo.cqrs.client.command;

import com.example.demo.cqrs.cgrs.Command;
import com.example.demo.cqrs.client.model.Client;

public class CreateClientCommand extends Command {

    private Client client;

    public CreateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
