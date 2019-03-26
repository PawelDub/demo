package com.example.demo.client.controller;

import com.example.demo.client.model.Client;
import com.example.demo.client.model.ClientDto;
import com.example.demo.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientController {

    ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public void addClient(@RequestBody ClientDto clientDto) {
        clientService.add(clientDto);
    }

    @PutMapping
    public void updateClient(@RequestBody Client client) {
        clientService.update(client);
    }

    @DeleteMapping("/{clientId}")
    public void deleteClient(@PathVariable UUID clientId) {
        System.out.println(clientId);
        clientService.delete(clientId);
    }

    @GetMapping("/{clientId}")
    public Client getClientById(@PathVariable UUID clientId) {
        return clientService.getByid(clientId);
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

}
