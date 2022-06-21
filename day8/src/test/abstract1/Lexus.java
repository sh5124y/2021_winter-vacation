package test.abstract1;

public class Lexus extends Car {
	private String prouducer = "Lexus";

	@Override
	public void drive() {
		System.out.println(prouducer+"자동차가 주행한다.");

	}

	@Override
	public void stop() {
		System.out.println(prouducer+"자동차가 멈춘다.");

	}

	@Override
	public void turnLrft() {
		System.out.println(prouducer+"자동차가 좌회전 한다.");

	}

	@Override
	public void turnRight() {
		System.out.println(prouducer+"자동차가 우회전 한다.");


	}

}
