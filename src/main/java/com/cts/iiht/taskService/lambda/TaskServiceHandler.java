package com.cts.iiht.taskService.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.cts.iiht.taskService.model.ApiGatewayResponse;

import java.util.Map;

public class TaskServiceHandler implements RequestHandler<Map<String, Object> , ApiGatewayResponse> {


    public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {


        return null;
    }


}
