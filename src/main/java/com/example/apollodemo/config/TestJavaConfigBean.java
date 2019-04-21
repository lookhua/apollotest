package com.example.apollodemo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Data
@Configuration
public class TestJavaConfigBean {

    @Value("${timeout:100}")
    private int timeout;

    @Value("${batch:200}")
    private int batch;

}