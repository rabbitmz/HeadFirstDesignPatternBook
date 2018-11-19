package strategy.pattern;

/**
 * The abstraction of a Duck
 * @author rabbit
 *
 */
public abstract class Duck 
{	
	
	/**
	 * <b>Principle</b> : Identify the aspects of the application that vary and encapsulate them.
	 * 
	 * In this use case, we have a set of algorithms for flying and quacking that change from duck to duck. So we separate them from the superclass Duck and encapsulate them in a different set of classes. 
	 * 
	 */
	
	/**
	 * <b>Principle</b> : Favor Composition over inheritance
	 *  Here we use other principles, those behaviors are outside the duck class and are composing the duck class. doing this we are able to change those behaviors at runtime.  
	 */
	
	/**
	 * <b>Principle</b> : Program to an interface, not an implementation
	 * As we keep the dependence for the main abstraction of each behavior, we are program to an interface and not to a concrete implementation.
	 * in this way we are making sure that only the interface defined in the abstract classes will be used in this contexts. 
	 */
	private FlyBehavior flyDelegate; 
	private QuackBehavior quackDelegate;
	
	public abstract void display();
	
	public void performFly() {
		this.flyDelegate.fly();
	}
	
	public void performQuack() {
		this.quackDelegate.quack();
	}
	
	public void swim()
	{
		System.out.println("ALl ducks float");
	}
	
	/***
	 * Injecting the behavior dynamically
	 */
	public void setFlyDelegate(FlyBehavior flyDelegate) {
		this.flyDelegate = flyDelegate;
	}

	public void setQuackDelegate(QuackBehavior quackDelegate) {
		this.quackDelegate = quackDelegate;
	}
}
