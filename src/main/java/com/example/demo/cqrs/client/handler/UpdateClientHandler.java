package com.example.demo.cqrs.client.handler;

import com.example.demo.cqrs.cgrs.CommandHandler;
import com.example.demo.cqrs.client.command.CreateClientCommand;
import com.example.demo.cqrs.client.command.UpdateClientCommand;
import com.example.demo.cqrs.client.repository.ClientCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UpdateClientHandler implements CommandHandler<CreateClientCommand>{

        ClientCommandRepository clientCommandRepository;

        public UpdateClientHandler() {
            System.out.println("1 UpdateClientHandler");
        }

        @Autowired
        public UpdateClientHandler(ClientCommandRepository clientCommandRepository) {
            System.out.println("2 UpdateClientHandler");
            this.clientCommandRepository = clientCommandRepository;
        }

        @Override
        public void handle(CreateClientCommand dispatchable) {
            clientCommandRepository.create(dispatchable.getClient());
            System.out.println("CreateClientHandler handle: ");
        }
}
