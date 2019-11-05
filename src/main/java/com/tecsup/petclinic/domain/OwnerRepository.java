package com.tecsup.petclinic.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

	// Fetch pets by typeId
	Owner findById(long Id);

}
