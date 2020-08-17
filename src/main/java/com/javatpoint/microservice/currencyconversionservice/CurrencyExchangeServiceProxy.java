package com.javatpoint.microservice.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="currency-exchange-service", url="localhost:8000")
public interface CurrencyExchangeServiceProxy {
	
}
