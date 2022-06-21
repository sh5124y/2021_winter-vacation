package test.abstract1;

public abstract class Car {
	public String name;
	
	public void showInfo() {
		System.out.println("Car는 자식클래스를 규격화하는 추상클래스이다.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void turnLrft();
	public abstract void turnRight();
}
