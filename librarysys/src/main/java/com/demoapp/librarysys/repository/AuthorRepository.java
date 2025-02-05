package com.demoapp.librarysys.repository;

import com.demoapp.librarysys.model.Author;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {
}
