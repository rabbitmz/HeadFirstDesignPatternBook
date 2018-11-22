package subject.observer.pattern.from.jdk;

public class Running {

	public static void main(String[] args) {
		
		WeatherData w =  new WeatherData();
		new CurrentConditionsDisplay(w);
		new TemperatureDisplay(w);
		w.measurementsChangeEvent(20f, 20f, 20f);
		
	}
}
