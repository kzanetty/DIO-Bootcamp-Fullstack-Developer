package com.henriquezanetti.projectspringdio.controller;

import com.henriquezanetti.projectspringdio.model.Address;
import com.henriquezanetti.projectspringdio.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<Iterable<Address>> findAll() {
        return ResponseEntity.ok(addressService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Address> findByCep(@PathVariable String id) {
        return ResponseEntity.ok(addressService.findByCep(id));
    }

    @PostMapping
    public ResponseEntity<Address> save(@RequestBody Address address) {
        addressService.save(address);
        return ResponseEntity.ok().body(address);
    }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable String id, @RequestBody Address address) {
        addressService.update(id, address);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id) {
        addressService.delete(id);
    }


}
