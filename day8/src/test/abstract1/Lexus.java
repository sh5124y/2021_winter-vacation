package test.abstract1;

public class Lexus extends Car {
	private String prouducer = "Lexus";

	@Override
	public void drive() {
		System.out.println(prouducer+"�ڵ����� �����Ѵ�.");

	}

	@Override
	public void stop() {
		System.out.println(prouducer+"�ڵ����� �����.");

	}

	@Override
	public void turnLrft() {
		System.out.println(prouducer+"�ڵ����� ��ȸ�� �Ѵ�.");

	}

	@Override
	public void turnRight() {
		System.out.println(prouducer+"�ڵ����� ��ȸ�� �Ѵ�.");


	}

}
