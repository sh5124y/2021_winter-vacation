package testarr2;

public class Arr2Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� �迭�� �ʱ�ȭ ���Ѽ� �迭 ��ü ���� �� ����
		String[][] favs1 = {{"ȣ����","������","�䳢","����"},{"���","��","�ٳ���","Ű��"},{"��","����","����","�ܿ�"}};
		
		for (int i = 0; i < favs1.length; i++) {
			for (int j = 0; j < favs1[i].length; j++) {
				System.out.println(favs1[1][j]+ "	");
			}
			System.out.println();
		}
	}

}
