package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author Victor Augusto
 */

@EnableFeignClients
@SpringBootApplication
@EnableSwagger2
class LabPadroesProjetoSpringApplicationTests {

	public static void main(String[] args){
		SpringApplication.run(LabPadroesProjetoSpringApplicationTests.class, args);
	}

}
