package com.abfintech.moniter.engine.monitorerrorpredictionservice.repo;

import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.ResponseStorageClass;
import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.SendRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends MongoRepository<SendRequest,String> {
}
