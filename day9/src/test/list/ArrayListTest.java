package test.list;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// String���� �ڷḦ ������ �� �ִ�  ArryListTest
		 ArrayList<String> namesList = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("�����Է�");
			 String name = s.nextLine();
			 namesList.add(name);
			 
			 System.out.println("������ ��� �Է� �Ͻðڽ��ϱ�? y/n");
			 String msg= s.nextLine();
			 if(msg.equals("n") || msg.equals("no"))
				 break;
		 }
		 for (int i = 0; i < namesList.size(); i++) {
			 System.out.println("===ArrayList nameList�� ����� ���� ��� ===");
			 System.out.println(namesList.get(i));
			
		}
		 s.close();
	}
	
}
