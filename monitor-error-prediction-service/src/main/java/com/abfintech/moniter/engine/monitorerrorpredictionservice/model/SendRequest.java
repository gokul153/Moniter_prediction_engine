package com.abfintech.moniter.engine.monitorerrorpredictionservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
@Document(collection = "requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendRequest {
    String request;
    @Id
    private String id;
    private String requestBody;
    private LocalDateTime timestamp;
    ArrayList<String> params;
    ArrayList<String> headers;
}
