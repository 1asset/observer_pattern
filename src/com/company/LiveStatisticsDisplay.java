package com.company;
	
public class LiveStatisticsDisplay implements Observer, DisplayElement {
	private float winning_coefficient;
	private float ball_possession;
	private MatchData matchData;
	
	public LiveStatisticsDisplay(MatchData weatherData) {
		this.matchData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float coefficient, float ball_possession, float minutes_played) {
		this.winning_coefficient = coefficient;
		this.ball_possession = ball_possession;
		display();
	}
	
	public void display() {
		System.out.println("Live statistics: " + winning_coefficient
			+ " - odds to win based on bookmakers " + ball_possession + "% ball possession");
	}
}
