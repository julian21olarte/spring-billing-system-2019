package com.julian21olarte.springbillingsystem2019.repositories;

import com.julian21olarte.springbillingsystem2019.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Long> {

    Client findByEmail(String email);
}
