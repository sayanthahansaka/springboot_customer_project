package com.sayantha.starter;

import com.sayantha.starter.util.ResponseUtil;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StarterApplication {

	public static void main(String[] args) {

		SpringApplication.run(StarterApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	@Bean
	public ResponseUtil responseUtil(){
		return new ResponseUtil();
	}

}
