package test.arr1;

import java.util.Scanner;

public class ScoreArr1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1���� �迭�� ���� �� ��ü ����
		int[] scores =new int [5];
		
		//Ű����� �Է¹��� ���� ���α׷� ������ �������� ���� scanner ��ü�� ����
		Scanner s = new Scanner(System.in);
		
		int sum =  0;
		double avg = 0;
		
		//���� ������ �Է� �޾Ƽ� �迭�� �����ϰ� �հ赵 ����
		String[]subjects = {"Java","c���","����", "����","����"};
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i]+"���� ���� �Է� : ");
			scores[i] = s.nextInt();
			sum  += scores[i];
		}
		
		avg = (double)sum / subjects.length;
		
		//�迭�� ����� ���� ����� ���� �ݺ���
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" :: ");
		}
		System.out.println();
		System.out.println("* �հ� : "+ sum);
		System.out.printf("* ��� : %.2f\n", avg);
		
		s.close();
	}

}
