package com.example.demo.client.handler;

import com.example.demo.cqrses.cgrs.CommandHandler;
import com.example.demo.client.command.CreateClientCommand;
import com.example.demo.client.repository.ClientCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CreateClientHandler implements CommandHandler<CreateClientCommand> {
    ClientCommandRepository clientCommandRepository;

    public CreateClientHandler() {
        System.out.println("1 CreateClientHandler");
    }

    @Autowired
    public CreateClientHandler(ClientCommandRepository clientCommandRepository) {
        System.out.println("2 CreateClientHandler");
        this.clientCommandRepository = clientCommandRepository;
    }

    @Override
    public void handle(CreateClientCommand dispatchable) {
        clientCommandRepository.create(dispatchable.getClient());
        System.out.println("CreateClientHandler handle: ");
    }
}
