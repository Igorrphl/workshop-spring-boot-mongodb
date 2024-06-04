package com.igorrodrigues.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.igorrodrigues.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
