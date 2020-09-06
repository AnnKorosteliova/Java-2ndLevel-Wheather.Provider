
public class WeatherApplication {

	public static void main(String[] args) {

		printWheather();
		
	}

	public static void printWheather() {
		System.out.println("########WEATHER########\n");
		System.out.println("TODAY: " + WeatherProvider.getTemperatureForToday() + " °C\n"
				+ "-------------------------\n "
				+ "FORECAST FOR 10 DAYS:\n");
		for (int i = 0; i < 10 ; i++) {
			System.out.println("DAY " + (i+1) + ": " +  WeatherProvider.getTemperaturesForecastFor10Days()[i] + " °C\n");
		}
		
		System.out.println("MAX: " + WeatherProvider.getMaxTemperatureFor10Days() + " °C\n"
						 + "AVG: " + WeatherProvider.calculateAvgFor10Days() + " °C\n"
						 + "MIN: " + WeatherProvider.getMinTemperatureFor10Days() + " °C\n");
		
		System.out.println("#######################");
	}
}
