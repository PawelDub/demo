package com.example.demo.client.handler;

import com.example.demo.client.command.DeleteClientCommand;
import com.example.demo.client.repository.ClientCommandRepository;
import com.example.demo.cqrses.cgrs.CommandHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteClientHandler implements CommandHandler<DeleteClientCommand> {

    ClientCommandRepository clientCommandRepository;

    public DeleteClientHandler() {
        System.out.println("1 DeleteClientHandler");
    }

    @Autowired
    public DeleteClientHandler(ClientCommandRepository clientCommandRepository) {
        System.out.println("2 DeleteClientHandler");
        this.clientCommandRepository = clientCommandRepository;
    }

    @Override
    public void handle(DeleteClientCommand dispatchable) {
        clientCommandRepository.delete(dispatchable.getClientId());
        System.out.println("DeleteClientHandler handle: " + dispatchable.getClientId());
    }
}
