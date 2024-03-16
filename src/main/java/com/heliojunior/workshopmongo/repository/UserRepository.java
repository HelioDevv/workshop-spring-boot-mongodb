package com.heliojunior.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.heliojunior.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
