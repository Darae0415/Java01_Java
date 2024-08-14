package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//길이가 3인 배열 생성
		String[] oldStrArr = {"Java","Array","Copy"};
		
		//길이가 5인 배열 새로 생성
		String[] newStrArr = new String[5];
		
		//oldStrArr 배열 항목을 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0,oldStrArr.length);

		//배열 항목을 출력
		for(int i=0; i<newStrArr.length; i++) {
			System.out.print(newStrArr[i]+", ");
		}
	}

}
