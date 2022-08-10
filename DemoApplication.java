package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
@RestController
	public class mainController{
		@RequestMapping(value ="/msg", method = RequestMethod.GET)
	public String getMessage(){
			return "welcome to spring";
		}
	@RequestMapping(value ="/msg1", method = RequestMethod.GET)
	public String getMessage1(){
		return "Maryam";
	}
	@RequestMapping(value ="/msg2", method = RequestMethod.GET)
	public String getMessage2(){
		return "ID:431019887";
	}
	@RequestMapping(value ="/msg3", method = RequestMethod.GET)
	public String getMessage3(){
		return "050038";
	}


}
}
