package com.tecsup.petclinic.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.domain.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService {
	
	private static final Logger logger = LoggerFactory.getLogger(OwnerServiceImpl.class);

	@Autowired
	OwnerRepository ownerRepository;

	/**
	 * 
	 * @param pet
	 * @return
	 */
	@Override
	public Owner create(Owner own) {
		return ownerRepository.save(own);
	}

	/**
	 * 
	 * @param pet
	 * @return
	 */
	@Override
	public Owner update(Owner own) {
		return ownerRepository.save(own);
	}


	/**
	 * 
	 * @param id
	 * @throws OwnerNotFoundException
	 */
	@Override
	public void delete(Long id){

		Owner own = findById(id);
		ownerRepository.delete(own);

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Owner findById(long id){

		Owner own = ownerRepository.findById(id);

		return own;
	}


	
	/**
	 * 
	 * @return
	 */
	@Override
	public Iterable<Owner> findAll() {
		
		// TODO Auto-generated 
		return ownerRepository.findAll();
	
	}
}
