package com.javatpoint.microservice.currencyconversionservice;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;  

@SpringBootApplication
@EnableFeignClients("com.javatpoint.microservices.currencyconversionservice")
public class CurrencyConversionServiceApplication {
	
//	@Autowired  
//	private CurrencyExchangeServiceProxy proxy;
	
	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}
