package test.inheritance1;

public class RunStudent {

	public static void main(String[] args) {
		student s1 = new student();
		s1.name = "권지용";
		s1.age = 35;
		s1.addr = "서울시 용산구 한남동";
		System.out.println("성명:"+s1.name);
		System.out.println("성명:"+s1.age);
		System.out.println("성명:"+s1.addr);
		
		System.out.print(s1.name+ "이");
		s1.eat();
		s1.sleep();
		s1.study();
	}
}
