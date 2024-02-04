package com.sandhu.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sandhu.demo.game.GameRunner;
import com.sandhu.demo.game.GamingConsole;

public class AppGamingSpringBeans {
    public static void main(String[] args) {

		try (var context = 
				new AnnotationConfigApplicationContext
					(GamingConfiguration.class)) {

			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();

		}
	}
}
