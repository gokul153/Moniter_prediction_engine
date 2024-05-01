package com.abfintech.moniter.engine.monitorerrorpredictionservice.service;

import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.ResponseStorageClass;
import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.SendRequest;
import com.abfintech.moniter.engine.monitorerrorpredictionservice.repo.RequestRepository;
import com.abfintech.moniter.engine.monitorerrorpredictionservice.repo.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class DataAddService {
    @Autowired
    private RequestRepository requestRepository;

    @Autowired
    private ResponseRepository responseRepository;

    public void saveRequest(String requestBody) {
        SendRequest requestData = new SendRequest();
        requestData.setRequestBody(requestBody);
        requestData.setTimestamp(LocalDateTime.now());
        requestRepository.save(requestData);
    }

    public void saveResponse(String responseBody,String partner,String rootCause,String email) {
        ResponseStorageClass responseData = new ResponseStorageClass();
        responseData.setResponse(responseBody);
        responseData.setPartner(partner);
        responseData.setRootcause(rootCause);

        if(Objects.isNull(email)){
            responseData.setInformEmail(email);
        }
        responseRepository.save(responseData);
    }


}
