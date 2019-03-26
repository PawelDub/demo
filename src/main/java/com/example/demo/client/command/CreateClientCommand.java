package com.example.demo.client.command;

import com.example.demo.cqrses.cgrs.Command;
import com.example.demo.client.model.Client;

public class CreateClientCommand extends Command {

    private Client client;

    public CreateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
