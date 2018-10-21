package com.power.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.power.bank.dao")
public class PowerBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerBankApplication.class, args);
	}
}
