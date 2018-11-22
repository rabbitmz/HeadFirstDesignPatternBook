package subject.observer.pattern.from.jdk;

import java.util.Observable;

/***
 * 
 * @author rabbit
 *
 */
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	/***
	 * JUST FOR TESTING PURPOSES
	 */
	public void measurementsChangeEvent(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.setChanged();
		this.notifyObservers();
	}

}
