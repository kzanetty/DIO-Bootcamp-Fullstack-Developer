package com.henriquezanetti.projectspringdio.controller;

import com.henriquezanetti.projectspringdio.model.Client;
import com.henriquezanetti.projectspringdio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client cliente) {
        clientService.save(cliente);
        return ResponseEntity.ok().body(cliente);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable Long id, @RequestBody Client client) {
        clientService.update(id, client);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id) {
        clientService.delete(id);
    }


}
