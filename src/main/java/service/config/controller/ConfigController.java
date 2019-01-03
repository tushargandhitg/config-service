package service.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import service.config.CalculatorConfig;

@RestController
public class ConfigController {

	@Autowired
	private CalculatorConfig config;
	
	@RequestMapping(method=RequestMethod.GET, value="/api/v1/calculatorconfig")
	public String loadCalculatorServiceConfig() {
		
		Gson json = new Gson();
		return json.toJson(config);
	}
	
}
