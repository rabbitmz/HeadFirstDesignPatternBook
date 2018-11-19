package strategy.pattern;

/**
 * 
 * @author rabbit
 *
 */
public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Duck quacking ");
	}

}
