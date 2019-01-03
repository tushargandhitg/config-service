package service.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
@ConfigurationProperties(prefix="calculator")
public class CalculatorServiceConfig {

	private Map<String,String> mymap=new HashMap<String, String>();

	@Bean
	public CalculatorConfig getConfigs() {
		CalculatorConfig config= new CalculatorConfig();
		config.setMap(mymap);
		
		return config;
	}
	
}
