package com.example.demo.cqrs.client.command;

import com.example.demo.cqrs.cgrs.Command;
import com.example.demo.cqrs.client.model.Client;

public class UpdateClientCommand extends Command {

    private Client client;

    public UpdateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
