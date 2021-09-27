package com.company;

public class PredictionDisplay implements Observer, DisplayElement {
	private float currentBallPossession = 65;
	private float lastBallPossession;
	private MatchData matchData;

	public PredictionDisplay(MatchData matchData) {
		this.matchData = matchData;
		matchData.registerObserver(this);
	}

	public void update(float coefficient, float ball_possession, float minutes_played) {
        lastBallPossession = currentBallPossession;
		currentBallPossession = minutes_played;

		display();
	}

	public void display() {
		System.out.print("Prediction: ");
		if (currentBallPossession > lastBallPossession) {
			System.out.println("Your team is doing great, their advantage is increased!");
		} else if (currentBallPossession == lastBallPossession) {
			System.out.println("The ball possession is not changed, the match is stable");
		} else if (currentBallPossession < lastBallPossession) {
			System.out.println("Your team lost the ball, opponent will control the game");
		}
	}
}
