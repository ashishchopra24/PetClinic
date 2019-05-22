package org.Pet.clinic.Data.services;

import java.util.Set;

public interface CrudService<T,ID> {

	Set<T> findAll();
	T findyId(ID id);
	T save(T object);
	void delete(T oject);
	void deleteById(ID id);	
}


