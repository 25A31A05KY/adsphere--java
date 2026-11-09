
package com.adsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdSphereApplication {

    public static void main(String[] args) {

        SpringApplication.run(AdSphereApplication.class, args);

        System.out.println("==================================");
        System.out.println(" AdSphere Application Started!");
        System.out.println(" Advertisement Management System");
        System.out.println("==================================");
    }
}
