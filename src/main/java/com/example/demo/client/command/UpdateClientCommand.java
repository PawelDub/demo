package com.example.demo.client.command;

import com.example.demo.cqrses.cgrs.Command;
import com.example.demo.client.model.Client;

public class UpdateClientCommand extends Command {

    private Client client;

    public UpdateClientCommand(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
