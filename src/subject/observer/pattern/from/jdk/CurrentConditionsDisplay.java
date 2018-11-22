package subject.observer.pattern.from.jdk;

import java.util.Observable;
import java.util.Observer;

import subject.observer.pattern.IDisplayElement;

public class CurrentConditionsDisplay implements Observer, IDisplayElement {

	/**We depend on a concrete class. here we brake the principle - Program to an interface not an implementation */
	private Observable observable;

	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) 
	{
		if(o instanceof WeatherData)
		{
			WeatherData w = (WeatherData) o;
			this.temperature = w.getTemperature(); 
			this.humidity = w.getHumidity(); 
			this.pressure = w.getPressure();
			this.display();
		}
	}

	@Override
	public void display() {
		System.out.println("DISPLAYING THE "+this.getClass().getName());
		System.out.println("Current Temperature " +temperature);
		System.out.println("Current humidity "+humidity);
		System.out.println("Current pressure "+pressure);	
	}

}
