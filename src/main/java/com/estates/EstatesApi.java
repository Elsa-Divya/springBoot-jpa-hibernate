package com.estates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
//@EnableAutoConfiguration(exclude ={JpaRepositoriesAutoConfiguration.class})
//@ComponentScan
@SpringBootApplication

@EnableJpaRepositories({"com.estates"})
public class EstatesApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(EstatesApi.class, args);
	}

}
