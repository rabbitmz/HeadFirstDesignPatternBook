package subject.observer.pattern.from.jdk;

import java.util.Observable;
import java.util.Observer;

import subject.observer.pattern.IDisplayElement;

/**
 * 
 * @author rabbit
 *
 */
public class TemperatureDisplay implements Observer, IDisplayElement {
	
	/**We depend on a concrete class. here we brake the principle - Program to an interface not an implementation */
	private Observable observable;

	private float temperature;

	public TemperatureDisplay(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void display() {
		System.out.println("DISPLAYING THE "+this.getClass().getName());
		System.out.println("Current Temperature " +temperature);
	}

	@Override
	public void update(Observable o, Object arg) {
		/**we just update when is the weatherData instance */
		if (o instanceof WeatherData) {
			WeatherData w = (WeatherData) o;
			//we use the pull mecanism, so we dont have to send all the states of the Subject to all observers 
			this.temperature = w.getTemperature();
		}
	}

}
