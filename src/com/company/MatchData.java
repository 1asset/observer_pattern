package com.company;

import java.util.*;

public class MatchData implements Subject {
	private List<Observer> observers;
	private float winning_coefficient;
	private float ball_possession;
	private float minutes_played;
	
	public MatchData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(winning_coefficient, ball_possession, minutes_played);
		}
	}
	
	public void KPIChanged() {
		notifyObservers();
	}

	//KPI - A Key Performance Indicator
	public void setKPI(float winning_coefficient, float ball_possession, float minutes_played) {
		this.winning_coefficient = winning_coefficient;
		this.ball_possession = ball_possession;
		this.minutes_played = minutes_played;
		KPIChanged();
	}

	public float getWinning_coefficient() {
		return winning_coefficient;
	}
	
	public float getBall_possession() {
		return ball_possession;
	}
	
	public float getMinutes_played() {
		return minutes_played;
	}

}
