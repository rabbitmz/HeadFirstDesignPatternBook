package subject.observer.pattern;

/**
 * An interface that represents the subjects
 * 
 * A subject is responsible to publish the data to the observers 
 * @author rabbit
 *
 */
public interface ISubject 
{
	void registerObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyObservers();
}
