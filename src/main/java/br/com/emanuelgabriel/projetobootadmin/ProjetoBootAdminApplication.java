package br.com.emanuelgabriel.projetobootadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
public class ProjetoBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBootAdminApplication.class, args);
	}

}
