package org.Pet.clinic.Data.services;

import java.util.Set;

import org.Pet.clinic.Data.model.Owner;

public interface OwnerService {

	Owner findBylastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
