package com.sandhu.demo;

import com.sandhu.demo.game.GameRunner;
import com.sandhu.demo.game.PackmanGame;
// import com.sandhu.demo.game.SuperContraGame;
// import com.sandhu.demo.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PackmanGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game); 
			//2: Object Creation + Wiring of Dependencies
			// Game is a Dependency of GameRunner
		
		gameRunner.run();

	}
}
