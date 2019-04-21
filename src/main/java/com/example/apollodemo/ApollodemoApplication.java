package com.example.apollodemo;

import com.example.apollodemo.config.TestJavaConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ApollodemoApplication {

    @Autowired
    private TestJavaConfigBean testJavaConfigBean;

    public static void main(String[] args) {
        SpringApplication.run(ApollodemoApplication.class, args);
    }

    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime() {
        System.out.println("time out :" + testJavaConfigBean.getTimeout());
    }

}
