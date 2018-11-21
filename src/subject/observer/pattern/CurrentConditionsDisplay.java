package subject.observer.pattern;

public class CurrentConditionsDisplay implements IObserver, IDisplayElement
{	
	private ISubject weatherData; 
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(ISubject weatherData) 
	{
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("DISPLAYING THE "+this.getClass().getName());
		System.out.println("Current Temperature " +temperature);
		System.out.println("Current humidity "+humidity);
		System.out.println("Current pressure "+pressure);	
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature; 
		this.humidity = humidity; 
		this.pressure = pressure;
		this.display();
	}

}
