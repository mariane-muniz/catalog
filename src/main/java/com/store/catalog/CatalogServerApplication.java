package com.store.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CatalogServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(CatalogServerApplication.class, args);
	}
}