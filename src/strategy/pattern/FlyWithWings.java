package strategy.pattern;
/**
 * A concrete implementation of the {@link FlyBehavior}
 * @author rabbit
 *
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Duck is flying with wings");
	}

}
