package test.overriding;

public class Laser extends Weapon {
	@Override
	public void fire() {
		super.fire();
		System.out.println("ÁöÀÌ~~À×");
	}
}