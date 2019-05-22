package org.Pet.clinic.Data.services;

import java.util.Set;

import org.Pet.clinic.Data.model.Pet;

public interface PetService {

	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
