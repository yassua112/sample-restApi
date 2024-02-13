package com.oracle.external.api.oracleservice.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.oracle.external.api.oracleservice.model.PostResponseDataTransaction;
import com.oracle.external.api.oracleservice.model.RequestData;
import com.oracle.external.api.oracleservice.model.ResponseData;

@Service
public class ServiceTransaction {

    public ResponseData generateDataTransaction(RequestData data) {
        PostResponseDataTransaction response = new PostResponseDataTransaction();

        if(ObjectUtils.isEmpty(ObjectUtils.isEmpty(data.getSampleservicerq().getOrder_type())) && ObjectUtils.isEmpty(data.getSampleservicerq().getService_id())){
            response.setError_code("400");
            response.setError_msg("Order Type dan Service id Harus Di isi");
           return ResponseData.builder().sampleservicers(response).build();
        }

        if(ObjectUtils.isEmpty(data.getSampleservicerq().getService_id())){
           response.setError_code("400");
           response.setError_msg("Service Id Harus Di isi");
           return ResponseData.builder().sampleservicers(response).build();
        }
        
        if(ObjectUtils.isEmpty(data.getSampleservicerq().getOrder_type())){
            response.setError_code("400");
            response.setError_msg("Order Type Harus Di isi");
           return ResponseData.builder().sampleservicers(response).build();
        }

        response.setError_code("200");
        response.setError_msg("Success");
        response.setTrx_id(UUID.randomUUID().toString());
        return ResponseData.builder().sampleservicers(response).build();

    }
    
}
