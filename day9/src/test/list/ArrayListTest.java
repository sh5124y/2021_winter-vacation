package test.list;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

	public static void main(String[] args) {
		// String형의 자료를 저장할 수 있는  ArryListTest
		 ArrayList<String> namesList = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		 
		 while(true) {
			 System.out.println("성명입력");
			 String name = s.nextLine();
			 namesList.add(name);
			 
			 System.out.println("성명을 계속 입력 하시겠습니까? y/n");
			 String msg= s.nextLine();
			 if(msg.equals("n") || msg.equals("no"))
				 break;
		 }
		 for (int i = 0; i < namesList.size(); i++) {
			 System.out.println("===ArrayList nameList에 저장된 내용 출력 ===");
			 System.out.println(namesList.get(i));
			
		}
		 s.close();
	}
	
}
