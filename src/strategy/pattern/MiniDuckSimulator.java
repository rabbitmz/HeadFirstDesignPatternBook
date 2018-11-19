package strategy.pattern;

/***
 * 
 * @author rabbit
 *	
 *	This package is an example of the strategy pattern. 
 *  
 *  
 *  <b>Intent :</b>The strategy pattern let you define a set of algorithms, encapsulate each one, and make them interchangeable. 
 *  
 *  The strategy uses a 
 *  	1. <b>context</b> class
 *  	2. an <b>interface</b> to define all the <b>strategies</b>
 *  	3. A set of algorithms implementing the strategy interface. 
 *  	4. And the client who knows what strategy to use and inject that in the context class 
 *  
 *
 *
 *
 */
public class MiniDuckSimulator {

	//the miniducksimulator is the client
	public static void main(String args []) {
		
		//Mallard duck is the context class 
		MallardDuck mallardDuck = new MallardDuck();
		//FlyWithWings and Quack are the behaviors implementing the strategy interface
		mallardDuck.setFlyDelegate(new FlyWithWings());
		mallardDuck.setQuackDelegate(new Quack());
		
		mallardDuck.performFly();
		mallardDuck.performQuack();
	}
	
}
