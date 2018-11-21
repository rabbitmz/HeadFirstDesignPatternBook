package subject.observer.pattern;

public class Running {
	public static void main(String[] args) {
		
		//We create our subject 
		WeatherData weatherData = new WeatherData();
		//creating our display. has the responsability of additing himself to the observes list in the subject 
		new CurrentConditionsDisplay(weatherData);
		weatherData.measurementsChangeEvent(20f, 62f, 30f);
		
		//adding a new observer to the list 
		new TemperatureDisplay(weatherData); 
		
		weatherData.measurementsChangeEvent(25f, 62f, 30f);
		
	}
}
