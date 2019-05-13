package com.julian21olarte.springbillingsystem2019.controllers;

import com.julian21olarte.springbillingsystem2019.entities.Client;
import com.julian21olarte.springbillingsystem2019.services.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(name = "/client")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/")
    public Iterable<Client> getClients() {
        return this.clientService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> clientById(@PathVariable("id") long clientId) {
        return this.clientService.findById(clientId);
    }
}
