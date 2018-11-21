package subject.observer.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author rabbit
 *
 */
public class WeatherData implements ISubject {

	private List<IObserver> observers;

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (IObserver o : this.observers) {
			o.update(temperature, humidity, pressure);
		}
	}

	/***
	 * JUST FOR TESTING PURPOSES
	 */
	public void measurementsChangeEvent(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.notifyObservers();
	}
}
