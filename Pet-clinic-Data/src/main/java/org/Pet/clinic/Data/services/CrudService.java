package org.Pet.clinic.Data.services;

public interface CrudService<T,ID> {

	T findAll();
	T findyId(ID id);
	T save(T object);
	void delete(T oject);
	void deleteById(ID id);	
}
