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
public class PostResponseDataTransaction implements Serializable{
    private String error_code;
    private String error_msg;
    private String trx_id;
}
