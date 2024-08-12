package ch05.sec07;

public class MultiArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1차배열
		//철수의 국 영 수 1차시험점수 1
		int[] scoreArr1 = {100,90,88};
		
		//철수의  국영수 점수  1차,2차3차시험
		int[][] scoreArr2 = {
				{100,90,88},
				{80,70,98},	
				{100,100,95}				
		};
		
		//3반 국영수 1,2,3차시험점수 (철수, 영희, 말자)
		int[][][] scoreArr3 = {
				   //국 영 수
				{ {100,90,88},  {80,70,98},	    {100,100,95}},       //철수
				{ {10,20,38},   {40,20,18},     {30,10,70}},         //영희
				{ {88,100,100}, {100,100,100},	{100,100,100}}   //말자				
		};
		
		
		//철수의 1차시험영어
		//1차배열
		System.out.print(scoreArr1[1]+ ", ");
		//2차배열
		System.out.print(scoreArr2[0][1]+ ", ");
		//3차배열
		System.out.println(scoreArr3[0][0][1]);

		//철수의 2차시험영어
		//1차배열 - 불가능
		//2차배열
		System.out.print(scoreArr2[1][1]+ ", ");
		//3차배열
		System.out.println(scoreArr3[0][1][1]);
		
		//말자의 1차시험 국어점수
		//1차배열 - 불가능
		//2차배열 - 불가능
		//3차배열
		System.out.println(scoreArr3[2][0][0]);
		
//		철수   국  영  수
//		1차
//		2차
//		3차
		System.out.printf("차수\t국어\t영어\t수학\n");
/*		System.out.printf("1차\t%02d\t%02d\t%02d\n", scoreArr2[0][0], scoreArr2[0][1], scoreArr2[0][2]);
		System.out.printf("2차\t%02d\t%02d\t%02d\n", scoreArr2[1][0], scoreArr2[1][1], scoreArr2[1][2]);
		System.out.printf("3차\t%02d\t%02d\t%02d\n", scoreArr2[2][0], scoreArr2[2][1], scoreArr2[1][2]);
*/		for(int i = 0; i<3; i++) {
			System.out.printf("%d차\t%02d\t%02d\t%02d\n",i+1, scoreArr2[i][0], scoreArr2[i][1], scoreArr2[i][2]);
		}

//		      1차  2차 3차
//		철수
//		영희
//		말자
		System.out.println("\n\n");
		System.out.println("3반 국어점수");
		System.out.println("-------------------------------");
		String[] names = {"철수","영희","말자"};
		System.out.printf("이름\t1차\t2차\t2차\n");
		System.out.println("-------------------------------");
		for(int n = 0; n<3; n++) {
			System.out.printf("%s\t%02d\t%02d\t%02d\n",names[n], scoreArr3[n][0][0], scoreArr3[n][1][0], scoreArr3[n][2][0]);
		}	  
		
		

	}

}
