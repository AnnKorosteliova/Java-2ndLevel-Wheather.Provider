import java.util.Random;

public class WeatherProvider {

	   private static double temperatureForToday = generateTemperature();
	   private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

	   private static double generateTemperature() {
	      Random rd = new Random(); 
	      double temperature = Math.ceil(3000 * ( rd.nextDouble() - 0.5 )) / 10;
	      return temperature;
	    }
	
	   private static double[] generateTemperaturesForecastFor10Days() {
		   double[] temperaturesFor10Days = new double[10];
		   Random rd = new Random();
		   for (int i = 0; i < temperaturesFor10Days.length; i++) {
			   temperaturesFor10Days[i] = Math.ceil(3000 * ( rd.nextDouble() - 0.5 )) / 10;
		}
		   return temperaturesFor10Days;
	   }

	    public static double getTemperatureForToday() {   
	    	return temperatureForToday;
	    }

	    public static double[] getTemperaturesForecastFor10Days() { 
	        return temperaturesFor10Days;
	    }

	    public static double calculateAvgFor10Days() {
	    	double avg = 0;
	        for (int i = 0; i < temperaturesFor10Days.length-1; i++) {
				avg += temperaturesFor10Days[i];
			}
	        avg /= 10;
	        avg = Math.ceil(avg * 10) / 10;
	        return avg;
	    }

	    public static double getMaxTemperatureFor10Days() {
	        double max = 0;
	         for (int i = 0; i < temperaturesFor10Days.length-1; i++) {	
				if(temperaturesFor10Days[i] > max)
					max = temperaturesFor10Days[i];
			}
	        return max;
	    }

	    public static double getMinTemperatureFor10Days() {
	    	double min = 0;
	        for (int i = 0; i < temperaturesFor10Days.length-1; i++) {
				if(temperaturesFor10Days[i] < min)
					min = temperaturesFor10Days[i];
			}
	        return min; 
	    }
	    
}
