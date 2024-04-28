package org.example.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.example.accounts.dto.AccountsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = AccountsContactInfoDto.class)
@OpenAPIDefinition(info = @Info(
		title = "Accounts microservice REST API documentation",
		description = "EazyBank Accounts microservice REST API documentation",
		version = "v1",
		contact = @Contact(
				name = "Sergii Vakaliuk",
				email = "vakals@gmail.com"
		),
		license = @License(
				name = "Apache 2.0"
		)),
		externalDocs = @ExternalDocumentation(
				description = "EazyBank Accounts microservice REST API documentation",
				url = "example.com"
))
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
