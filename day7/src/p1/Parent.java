package p1;

public class Parent {
	//상속 관계 일때는 자식이 부모의 Protected 멤버를 접근할 수 있다.
	protected int num1;
	
	protected void test1() {
		System.out.println("parent test1() 호출");
	}
}
