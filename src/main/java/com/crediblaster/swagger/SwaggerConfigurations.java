package com.crediblaster.swagger;


import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfigurations {
	
	@Bean
	public Docket clienteApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.crediblaster"))
				.paths(PathSelectors.ant("/**"))
				.build()
				//.ignoreParametersTypes(Usuario.class)
				.globalOperationParameters(Arrays.asList(
						new ParameterBuilder()
						.name("Authorization")
						.description("Header para Token JWT")
						.modelRef(new ModelRef("string"))
						.parameterType("Header")
						.required(false)
						.build()))
						.apiInfo(apiInfo());
		
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	            .title("CrediBlaster REST API")
	            .description("O renomado CrediBlaster, outrora somente em .NET, agora em Spring Boot REST API")
	            .version("1.0.0")
	            .license("Apache License Version 2.0")
	            .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
	            .contact(new Contact("Leonardo", "https://crediblaster.com.br", "contato@crediblaster.com.br"))
	            .build();
	}
	
	
}
