package subject.observer.pattern;

/**
 * Represents an observer - An observer is a class that wants to register to the
 * {@link ISubject} and wants to receive the notifications from her
 * 
 * @author rabbit
 *
 */
public interface IObserver {
	
	//contains the update method 
	void update(float temperature,float humidity,float pressure);
}
