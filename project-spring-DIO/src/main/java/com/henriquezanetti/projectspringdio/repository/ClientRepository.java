package com.henriquezanetti.projectspringdio.repository;

import com.henriquezanetti.projectspringdio.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
