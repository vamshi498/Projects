package com.vamshilabs.micorservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		/*
		 * Without feign approach*/
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean currencyConversionBean = responseEntity.getBody();
		
		return new CurrencyConversionBean(currencyConversionBean.getId(), from, to, quantity, currencyConversionBean.getConversionMultiple(),quantity.multiply(currencyConversionBean.getConversionMultiple()), 
				currencyConversionBean.getPort());
	}
	
	/**
	 * Using feign**/
	@GetMapping("/currency-conversionfeign/from/{from}/to/{to}/quantity/{quantity}")
	public  CurrencyConversionBean convertCurrencyUsingFeign(@PathVariable String from, @PathVariable String to , 
			@PathVariable BigDecimal quantity) {
		CurrencyConversionBean currencyConversionBean = proxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversionBean(currencyConversionBean.getId(), from, to, quantity, currencyConversionBean.getConversionMultiple(),quantity.multiply(currencyConversionBean.getConversionMultiple()), 
				currencyConversionBean.getPort());
	}
}
