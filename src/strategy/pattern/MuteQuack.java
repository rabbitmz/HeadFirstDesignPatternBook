package strategy.pattern;

/**
 * 
 * @author rabbit
 *
 */
public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("I'm mute");
	}

}
