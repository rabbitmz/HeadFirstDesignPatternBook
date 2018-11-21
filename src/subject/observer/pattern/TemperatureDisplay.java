package subject.observer.pattern;

public class TemperatureDisplay implements IDisplayElement, IObserver{
	
	private float temperature;
	private ISubject weatherData; 
	
	
	public TemperatureDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
		
	
	//As the observer uses a push way . The TemperatureDisplay receive state unnecessary. 	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature; 
		this.display();
	}

	@Override
	public void display() {
		System.out.println("DISPLAYING THE "+this.getClass().getName());
		System.out.println("Current Temperature " +temperature);
	}

}
