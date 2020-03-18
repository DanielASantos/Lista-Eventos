package br.com.daniel.listaeventos;

//import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Configuracao {

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
	
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("org.postgresql.Driver");
//		dataSource.setUrl("jdbc:postgresql://localhost:5432/db_lista_eventos");
//		dataSource.setUsername("postgres");
//		dataSource.setPassword("Bds@cond");
//		return dataSource;
//	}
}
