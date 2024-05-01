package com.abfintech.moniter.engine.monitorerrorpredictionservice.controller.abrail;

import com.abfintech.moniter.engine.monitorerrorpredictionservice.model.SendRequest;
import com.abfintech.moniter.engine.monitorerrorpredictionservice.service.DataAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@Api(value = "Enter request")
@RestController
@RequestMapping("/entry")
public class StoreRequest {

    @Autowired
    private DataAddService dataAddService;

    @PostMapping("/request")
    public ResponseEntity<String> saveRequest(@RequestBody String requestBody) {
        dataAddService.saveRequest(requestBody);
        return ResponseEntity.ok("Request saved successfully");
    }

}
