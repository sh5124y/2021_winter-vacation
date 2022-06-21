package test.arr1;

import java.util.Scanner;

public class ScoreArr1Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차원 배열의 선언 및 객체 생성
		int[] scores =new int [5];
		
		//키보드로 입력받은 값을 프로그램 안으로 가져오기 위해 scanner 객체를 생성
		Scanner s = new Scanner(System.in);
		
		int sum =  0;
		double avg = 0;
		
		//과목별 점수를 입력 받아서 배열에 저장하고 합계도 구함
		String[]subjects = {"Java","c언어","국어", "영어","수학"};
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.print(subjects[i]+"과목 점수 입력 : ");
			scores[i] = s.nextInt();
			sum  += scores[i];
		}
		
		avg = (double)sum / subjects.length;
		
		//배열에 저장된 점수 출력을 위한 반복문
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+" :: ");
		}
		System.out.println();
		System.out.println("* 합계 : "+ sum);
		System.out.printf("* 평균 : %.2f\n", avg);
		
		s.close();
	}

}
