package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "������";
		s1.age = 35;
		s1.addr = "����� ��걸 �ѳ���";
		System.out.println("����:"+s1.name);
		System.out.println("����:"+s1.age);
		System.out.println("����:"+s1.addr);
		
		System.out.print(s1.name+ "��");
		s1.eat();
		s1.sleep();
		s1.study();
	}
}