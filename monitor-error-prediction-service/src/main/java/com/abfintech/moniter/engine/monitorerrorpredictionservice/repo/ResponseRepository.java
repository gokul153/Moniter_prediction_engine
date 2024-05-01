package com.abfintech.moniter.engine.monitorerrorpredictionservice.repo;

import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.ResponseStorageClass;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ResponseRepository extends MongoRepository<ResponseStorageClass,String> {

}
