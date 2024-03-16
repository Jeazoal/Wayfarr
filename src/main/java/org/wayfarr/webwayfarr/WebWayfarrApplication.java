package org.wayfarr.webwayfarr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WebWayfarrApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebWayfarrApplication.class, args);
    }

}
