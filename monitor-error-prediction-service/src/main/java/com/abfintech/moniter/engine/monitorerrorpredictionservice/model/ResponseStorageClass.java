package com.abfintech.moniter.engine.monitorerrorpredictionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "responses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseStorageClass {
    String response;
    String partner;
    String rootcause;
    String informEmail;
}
