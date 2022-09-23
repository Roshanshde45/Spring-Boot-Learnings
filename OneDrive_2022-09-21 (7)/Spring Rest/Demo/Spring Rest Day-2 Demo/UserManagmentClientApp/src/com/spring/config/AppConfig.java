package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.spring")
public class AppConfig {
	@Bean
	RestTemplate getTemplate() {
	RestTemplate template = new RestTemplate();	
	MappingJackson2HttpMessageConverter  converter= new MappingJackson2HttpMessageConverter();
	template.getMessageConverters().add(converter);
	return template;
	}
	

}
