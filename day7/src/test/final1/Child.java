package test.final1;

public class Child extends Parent{
	//final �ʵ�� ���߿� �� ���� ����
	public final int time = 3;
	
	
	@Override
	public void rest() {
	//	time = 5;
		System.out.println(time+"�ð� �޽�");

	}
}
