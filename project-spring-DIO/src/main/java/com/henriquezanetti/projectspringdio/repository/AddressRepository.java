package com.henriquezanetti.projectspringdio.repository;

import com.henriquezanetti.projectspringdio.model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address,String> {

}
