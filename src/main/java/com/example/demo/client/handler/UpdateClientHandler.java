package com.example.demo.client.handler;

import com.example.demo.client.command.UpdateClientCommand;
import com.example.demo.cqrses.cgrs.CommandHandler;
import com.example.demo.client.command.CreateClientCommand;
import com.example.demo.client.repository.ClientCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UpdateClientHandler implements CommandHandler<UpdateClientCommand>{

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
        public void handle(UpdateClientCommand dispatchable) {
            clientCommandRepository.create(dispatchable.getClient());
            System.out.println("UpdateClientHandler handle: ");
        }
}
