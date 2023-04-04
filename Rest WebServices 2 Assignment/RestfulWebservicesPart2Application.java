package com.example.Restful.Webservices.Part2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import java.util.Locale;

@SpringBootApplication
public class RestfulWebservicesPart2Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebservicesPart2Application.class, args);
	}
	
	//Internationalization
    @Bean
	public LocaleResolver localeResolver()
	{
		AcceptHeaderLocaleResolver localeResolver=new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.ENGLISH);
		return localeResolver;
	}

}