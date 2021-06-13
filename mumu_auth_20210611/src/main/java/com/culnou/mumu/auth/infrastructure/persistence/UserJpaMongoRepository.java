package com.culnou.mumu.auth.infrastructure.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.culnou.mumu.auth.domain.model.User;

public interface UserJpaMongoRepository extends MongoRepository<User, String> {

}
