package test.access3;

public class RunAccessSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSample a1 = new AccessSample();
		a1.n1 = 100;
		a1.setN2(88);
		
		System.out.printf("a1이 참조하는 AccessSample 객체의 n1필드 :  \n%d",a1.n1);
		System.out.printf("a1이 참조하는 AccessSample 객체의 n2필드 :  %d",a1.getN2());
	}

}
