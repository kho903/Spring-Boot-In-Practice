package com.jikim.ch02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

import com.jikim.ch02.configurationproperties.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ConfigurationPropertiesApplication {

	private static final Logger log = LoggerFactory.getLogger(ConfigurationPropertiesApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext
			= SpringApplication.run(ConfigurationPropertiesApplication.class, args);
		AppService appService
			= applicationContext.getBean(AppService.class);
		log.info(appService.getAppProperties().toString());
	}

}
