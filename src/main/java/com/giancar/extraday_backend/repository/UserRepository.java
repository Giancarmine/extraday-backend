package com.giancar.extraday_backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.giancar.extraday_backend.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}