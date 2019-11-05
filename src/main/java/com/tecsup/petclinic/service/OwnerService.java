package com.tecsup.petclinic.service;


import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Owner;

@Service
public interface OwnerService {
	/**
	 * 
	 * @param pet
	 * @return
	 */
	Owner create(Owner own);

	/**
	 * 
	 * @param pet
	 * @return
	 */
	Owner update(Owner own);

	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException 
	 */
	void delete(Long id);

	/**
	 * 
	 * @param id
	 * @return
	 * @throws OwnerNotFoundException 
	 */
	Owner findById(long id);

	

	/**
	 * 
	 * @return
	 */
	Iterable<Owner> findAll();
}
