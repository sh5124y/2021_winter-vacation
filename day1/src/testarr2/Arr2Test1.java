package testarr2;

public class Arr2Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열을 초기화 시켜서 배열 객체 선언 및 생성
		String[][] favs1 = {{"호랑이","강아지","토끼","사자"},{"사과","귤","바나나","키위"},{"봄","여름","가을","겨울"}};
		
		for (int i = 0; i < favs1.length; i++) {
			for (int j = 0; j < favs1[i].length; j++) {
				System.out.println(favs1[1][j]+ "	");
			}
			System.out.println();
		}
	}

}
