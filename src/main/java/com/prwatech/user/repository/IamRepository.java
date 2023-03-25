package com.prwatech.user.repository;

import com.prwatech.user.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface IamRepository extends MongoRepository<User, String> {

  Optional<User> findByEmail(String Email);
}
