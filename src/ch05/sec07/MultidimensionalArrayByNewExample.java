package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		//각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열을 생성
		int[][] mathScores = new int[2][3];
		
		//배열 항목 초기값 출력
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]: "+mathScores[i][k]);
			}
		}
		System.out.println();
		//배열 항목 값을 변경하기
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		//전체 학생의 수학평균 구하기
		int totalstudent=0;
		int totalSum=0;
		for(int i=0; i<mathScores.length; i++) {
			totalstudent += mathScores[i].length;
			for(int k=0; k<mathScores[i].length; k++) {
				totalSum += mathScores[i][k];
			}
		}
		double totalAvg = (double)totalSum/totalstudent;
		System.out.println("전체 학생의 수학평균: "+totalAvg);
		System.out.println();
		
		//각 반의 학생 수가 다른 경우 점수 저장을 위한 2차원 배열을 생성하기
		int[][] engScores= new int[2][];
		engScores[0]= new int[2];
	    engScores[1]= new int[3];
	    
	    for(int i=0; i<engScores.length; i++) {
	    	for(int k=0; k<engScores[i].length; k++) {
	    		System.out.println("engScores["+i+"]["+k+"]: "+engScores[i][k]);
	    	}
	    }
	    System.out.println();
	    
	    //배열 항목(객체) 값을 변경
	    engScores[0][0]=90;
	    engScores[0][1]=91;
	    engScores[1][0]=92;
	    engScores[1][1]=93;
	    engScores[1][2]=94;
	    
	    //전체 학생 영어 평균 구하기
	    int totalstudent1=0;
		int totalSum1=0;
		for(int i=0; i<engScores.length; i++) {
			totalstudent1 += engScores[i].length;
			for(int k=0; k<engScores[i].length; k++) {
				totalSum1 += engScores[i][k];
			}
		}
		double totalAvg1 = (double)totalSum1 / totalstudent1;
		System.out.println("전체 학생의 영어평균: "+totalAvg1);
	}

}
