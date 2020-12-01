package com.example.demo;

import com.example.demo.entity.ExportDataCallbackReq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String sayHello(){
		return  "Todo perfecto, Bienvenido";
	}

	@GetMapping("/message/{input}")
	public String getMessage(@PathVariable String input){
		return  "Todo perfecto, Bienvenido: " + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostMapping("/")
	public String sayHelloPost(){
		return  "Todo perfecto, Bienvenido POST";
	}
	@PostMapping("/agc/analytics/callback")
	public String callback(@RequestBody @Validated ExportDataCallbackReq req){
		System.out.println(req.getFilePath());
		return req.getFilePath();
	}
}
