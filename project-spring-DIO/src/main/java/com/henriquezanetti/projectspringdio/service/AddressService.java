package com.henriquezanetti.projectspringdio.service;

import com.henriquezanetti.projectspringdio.model.Address;
import com.henriquezanetti.projectspringdio.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;


    public Iterable<Address> findAll() {
        return addressRepository.findAll();
    }

    public Address findByCep(String cep) {
        Optional<Address> obj = addressRepository.findById(cep);
        return obj.get();
    }

    public void save(Address address) {
        addressRepository.save(address);
    }

    public void update(String cep, Address address) {
        Optional<Address> updateAddress = addressRepository.findById(cep);
        updateData(updateAddress.get(), address);
        addressRepository.save(updateAddress.get());
    }

    public void delete(String cep) {
        addressRepository.deleteById(cep);
    }

    // metodos auxiliares

    public void updateData(Address oldAddress, Address newAddress) {
        oldAddress.setRua(newAddress.getRua());
        oldAddress.setComplemento(newAddress.getComplemento());
        oldAddress.setBairro(newAddress.getBairro());
        oldAddress.setLocalidade(newAddress.getLocalidade());
        oldAddress.setEstado(newAddress.getEstado());
    }

}
