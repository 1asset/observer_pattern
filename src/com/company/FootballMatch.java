package com.company;

public class FootballMatch {

	public static void main(String[] args) {
		MatchData matchData = new MatchData();
	
		LiveStatisticsDisplay currentDisplay =
			new LiveStatisticsDisplay(matchData);
		OverallStatisticsDisplay statisticsDisplay = new OverallStatisticsDisplay(matchData);
		PredictionDisplay forecastDisplay = new PredictionDisplay(matchData);

		matchData.setKPI(2.1f, 60, 30);
		matchData.setKPI(2.5f, 70, 45);
		matchData.setKPI(3, 55, 60);
		
		matchData.removeObserver(forecastDisplay);
		matchData.setKPI(1.5f, 90, 90);
	}
}
