package com.henriquezanetti.projectspringdio.model;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @OneToOne
    @JoinColumn(name = "address_cep")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public Client() {
    }

    public Client(Long id, String nome, Address address) {
        this.id = id;
        this.nome = nome;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
