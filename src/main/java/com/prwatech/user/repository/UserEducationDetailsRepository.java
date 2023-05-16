package com.prwatech.user.repository;

import com.prwatech.user.model.UserEducationDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@EnableMongoRepositories
@Repository
public interface UserEducationDetailsRepository
    extends MongoRepository<UserEducationDetails, String> {}
