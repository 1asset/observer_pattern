package com.company;

public class OverallStatisticsDisplay implements Observer, DisplayElement {
	private float maxCoefficient = 0.0f;
	private float minCoefficient = 1.0f;
	private float coefficientSum = 0.0f;
	private int numReadings;
	private MatchData matchData;

	public OverallStatisticsDisplay(MatchData weatherData) {
		this.matchData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float coefficient, float ball_possession, float minutes_played) {
		coefficientSum += coefficient;
		numReadings++;

		if (coefficient > maxCoefficient) {
			maxCoefficient = coefficient;
		}
 
		if (coefficient < minCoefficient) {
			minCoefficient = coefficient;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min goals scored in the match = " + (coefficientSum / numReadings)
			+ "/" + maxCoefficient + "/" + minCoefficient);
	}
}
