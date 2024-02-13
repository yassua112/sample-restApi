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
public class PostRequestDataTransaction implements Serializable{
    private String service_id;
    private String order_id;
    private String order_type;
    private String type;
    private String trx_id;
}
