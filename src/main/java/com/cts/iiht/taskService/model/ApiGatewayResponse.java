package com.cts.iiht.taskService.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@AllArgsConstructor
@Data
public class ApiGatewayResponse {

    private final int statusCode;
    private  String body;
    private final Map<String, Object> headers;
}
