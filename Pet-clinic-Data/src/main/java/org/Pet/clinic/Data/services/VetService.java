package org.Pet.clinic.Data.services;

import java.util.Set;

import org.Pet.clinic.Data.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
