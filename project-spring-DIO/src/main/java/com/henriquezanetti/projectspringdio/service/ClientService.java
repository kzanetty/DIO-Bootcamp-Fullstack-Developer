package com.henriquezanetti.projectspringdio.service;

import com.henriquezanetti.projectspringdio.model.Client;
import com.henriquezanetti.projectspringdio.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @GetMapping
    public Client findById(Long id) {
        Optional<Client> obj = clientRepository.findById(id);
        return obj.get();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public void update(Long id, Client client) {
        Optional<Client> clientUpdate = clientRepository.findById(id);
        updateData(clientUpdate.get(), client);
        clientRepository.save(clientUpdate.get());
    }

    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    // metodo auxiliar próprio

    private void updateData(Client oldClient, Client newClient) {
        oldClient.setNome(newClient.getNome());
    }

}
