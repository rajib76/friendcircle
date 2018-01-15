package com.iWant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
@ComponentScan ({"com.iWant.*"})
public class IWantApplication {

	public static void main(String[] args) {
		SpringApplication.run(IWantApplication.class, args);
	}
/*	@Bean
	public AlwaysSampler defaultSampler() {
	  return new AlwaysSampler();
	}*/
}
