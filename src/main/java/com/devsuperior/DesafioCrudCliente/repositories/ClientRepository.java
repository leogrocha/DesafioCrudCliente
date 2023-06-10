package com.devsuperior.DesafioCrudCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DesafioCrudCliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
    
}
