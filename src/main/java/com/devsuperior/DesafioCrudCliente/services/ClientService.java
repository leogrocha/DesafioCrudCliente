package com.devsuperior.DesafioCrudCliente.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.DesafioCrudCliente.dto.ClientDTO;
import com.devsuperior.DesafioCrudCliente.repositories.ClientRepository;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repository;

    @Transactional
    public ClientDTO findById(Long id) {
        return repository.findById(id).map(ClientDTO::new).get();
    }



}
