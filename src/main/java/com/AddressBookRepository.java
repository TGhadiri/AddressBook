package com;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface AddressBookRepository extends CrudRepository<AddressBook, Long> {
   Optional<AddressBook> findById(Long id);
}
