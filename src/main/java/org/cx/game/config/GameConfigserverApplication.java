package org.cx.game.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GameConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GameConfigserverApplication.class, args);
	}

}
