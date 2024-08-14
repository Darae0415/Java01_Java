package ch05.sec09;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		//길이가 3인 배열
		int[] oldIntArr= {1,2,3};
		
		//길이가 5인 배열을 새로 생성
		int[] newIntArr=new int[5];
		
		//oldIntArr배열 항목(객체)을 복사
		for(int i=0; i<oldIntArr.length; i++) {
			newIntArr[i]=oldIntArr[i];
		}
		//newIntArr에 잘 복사 되었는지 항목을 출력
		for(int i=0; i<newIntArr.length; i++) {
			System.out.print(newIntArr[i]+", ");
		}
		
		
	}

}
