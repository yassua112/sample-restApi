package com.oracle.external.api.oracleservice.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestData implements Serializable{

    private PostRequestDataTransaction sampleservicerq;
    
}
