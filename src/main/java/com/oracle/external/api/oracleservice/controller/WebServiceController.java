package com.oracle.external.api.oracleservice.controller;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.external.api.oracleservice.model.PostResponseDataTransaction;
import com.oracle.external.api.oracleservice.model.RequestData;
import com.oracle.external.api.oracleservice.model.ResponseData;
import com.oracle.external.api.oracleservice.service.ServiceTransaction;


import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/external/services/rest")
public class WebServiceController {

    private final ServiceTransaction serviceTransaction;

    @PostMapping(value = "/sample-service")
    public ResponseData getDataValidation(@RequestBody RequestData data, @RequestHeader("username") String userName,@RequestHeader("password") String password){
        PostResponseDataTransaction response = new PostResponseDataTransaction();
         if(ObjectUtils.isEmpty(userName)){
            response.setError_code("400");
            response.setError_msg("username Harus Di isi");
            return ResponseData.builder().sampleservicers(response).build();
        }
        if(ObjectUtils.isEmpty(password)){
            response.setError_code("400");
            response.setError_msg("password Harus Di isi");
            return ResponseData.builder().sampleservicers(response).build();
        }

        if(!userName.equals("user") || !password.equals("admin")){
            response.setError_code("400");
            response.setError_msg("User name Dan Password Anda Tidak diketahui");
            return ResponseData.builder().sampleservicers(response).build();
        }
        return serviceTransaction.generateDataTransaction(data);
    }
    
}
