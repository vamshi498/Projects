package com.vamshilabs.micorservices.currencyconversionservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//Approach 1
//@FeignClient(name="currency-exchange-service" , url = "localhost:8000")

//Approach 2 
@FeignClient(name="currency-exchange-service")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from , @PathVariable("to") String to);
}