package com.h2springexample.demotest;

import com.h2springexample.demotest.controller.AppStarter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemotestApplication implements CommandLineRunner {

	@Autowired
    AppStarter appStarter;

	public static void main(String[] args) {
		SpringApplication.run(DemotestApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
	    appStarter.appStart();
    }
}
