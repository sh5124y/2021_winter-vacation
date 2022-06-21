package testarr2;

public class Arr2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 선언 및 객체 생성
		int[][] nums = new int[3][4];
		
		int count = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j]= 10 * count++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

}
