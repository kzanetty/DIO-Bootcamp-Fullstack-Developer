package com.henriquezanetti.projectspringdio.config;

import com.henriquezanetti.projectspringdio.model.Address;
import com.henriquezanetti.projectspringdio.model.Client;
import com.henriquezanetti.projectspringdio.service.AddressService;
import com.henriquezanetti.projectspringdio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private ClientService clientService;

    @Autowired
    private AddressService addressService;

    @Override
    public void run(String... args) throws Exception {


//        Address ad1 = new Address(cep, rua, complemento, bairro, localidade, estado);
        Address ad1 = new Address("12345-1", "Rua Um", "apt-1", "Bairro Um", "Brasil", "Rio Grande do Sul");
        Address ad2 = new Address("12345-2", "Rua Dois", "apt-2", "Bairro Dois", "Brasil", "Rio Grande do Sul");
        Address ad3 = new Address("12345-3", "Rua Três", "apt-3", "Bairro Três", "Brasil", "Rio Grande do Sul");

        addressService.save(ad1);
        addressService.save(ad2);
        addressService.save(ad3);

        Client c1 = new Client(null, "Henrique", ad1);
        Client c2 = new Client(null, "Vinicius", ad2);
        Client c3 = new Client(null, "Julia", ad3);

        clientService.save(c1);
        clientService.save(c2);
        clientService.save(c3);

//        Client c4 = new Client(null, "Leandro", ad2);
//        clientService.update(2L, c4);
//        clientService.delete(1L);

    }
}
