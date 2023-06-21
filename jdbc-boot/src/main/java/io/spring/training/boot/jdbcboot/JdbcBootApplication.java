package io.spring.training.boot.jdbcboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class JdbcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcBootApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(JdbcTemplate jdbcTemplate) {
		
		String Query = "select count(*) from T_ACCOUNT";

		return args -> System.out.println("Hello, there are " + jdbcTemplate.queryForObject(Query, Long.class) + " accounts");
		
	}

}
