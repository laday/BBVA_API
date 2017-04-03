package com.api;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by lday15 on 3/28/2017.
 */
@RepositoryRestResource(collectionResourceRel = "BBVA", path = "BBVA")
public interface MongoRepo extends MongoRepository<Id, String> {


}
