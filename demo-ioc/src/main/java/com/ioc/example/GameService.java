package com.ioc.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameService {

	// Score score = new Score();
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
	Score score = context.getBean("scores", Score.class);

	public void playTheGame(String clientGesture) {
		if (clientGesture.equalsIgnoreCase("loss")) {
			score.losses++;
		}
		if (clientGesture.equalsIgnoreCase("win")) {
			score.wins++;
		}
		if (clientGesture.equalsIgnoreCase("tie")) {
			score.ties++;
		}
	}

	public static void main(String args[]) {
		GameService gs = new GameService();
		// call playgame method
		gs.playTheGame("win");
		gs.playTheGame("loss");
		gs.playTheGame("win");
		gs.playTheGame("loss");
		gs.playTheGame("win");

		System.out.print("Wins: " + gs.score.wins);
		System.out.print("..Losses: " + gs.score.losses);
		System.out.print("..Ties: " + gs.score.ties);

	}

}
