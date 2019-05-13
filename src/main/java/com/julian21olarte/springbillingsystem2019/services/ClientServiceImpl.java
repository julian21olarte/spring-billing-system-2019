package com.julian21olarte.springbillingsystem2019.services;

import com.julian21olarte.springbillingsystem2019.entities.Client;
import com.julian21olarte.springbillingsystem2019.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Client> findAll() {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Client> findById(Long id) {
        return this.clientRepository.findById(id);
    }

    @Override
    @Transactional
    public Client save(Client client) {
        return this.clientRepository.save(client);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        this.clientRepository.deleteById((id));
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existById(Long id) {
        return this.clientRepository.existsById(id);
    }
}
