package com.sandhu.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sandhu.demo.game.GameRunner;
import com.sandhu.demo.game.GamingConsole;
import com.sandhu.demo.game.PackmanGame;

@Configuration
public class GamingConfiguration {
    @Bean
	public GamingConsole game() {
		var game = new PackmanGame();
		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
