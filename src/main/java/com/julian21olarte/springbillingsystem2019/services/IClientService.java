package com.julian21olarte.springbillingsystem2019.services;

import com.julian21olarte.springbillingsystem2019.entities.Client;

import java.util.Optional;

public interface IClientService {

    Iterable<Client> findAll();
    Optional<Client> findById(Long id);
    Client save(Client client);
    void deleteById(Long id);
    boolean existById(Long id);
}
