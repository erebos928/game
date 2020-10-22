package sport.football.game;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackages={"sport.football.controllers","sport.football.dataaccess","sport.football.entities",
		"sport.football.game"})
@SpringBootApplication
@EnableJpaRepositories(basePackages={"sport.football.dataaccess","sport.football.entities"}) 
@EntityScan("sport.football.entities")
public class GameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameApplication.class, args);
	}

}
