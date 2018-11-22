package subject.observer.pattern;

/**
 * Represents an observer - An observer is a class that wants to register to the
 * {@link ISubject} and wants to receive the notifications from her
 * 
 * Here we apply the principle: 
 * 
 * 	Identify the aspects that vary and encapsulate them. Used in the strategy pattern. 
 * 	We define a common interface and a set of algorithms implementing this interface
 * 
 * @author rabbit
 *
 */
public interface IObserver {
	
	//contains the update method 
	void update(float temperature,float humidity,float pressure);
}
