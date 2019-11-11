package com.suntossh.springboot.client.forex.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.suntossh.springboot.client.forex.model.Forex;

@RestController
public class ForexController {

	@Autowired
	private Environment env;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ResponseEntity<Forex> fetchForex(@PathVariable String from, @PathVariable String to) {
		double rate = Math.random() * 100;
		Forex body = new Forex(from, to, new BigDecimal(rate), new BigDecimal(100 * rate), null,
				env.getProperty("local.server.port"));
		System.out.println(body.toString());
		return new ResponseEntity<Forex>(body, HttpStatus.OK);
	}

}
