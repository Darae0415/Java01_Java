package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("abc");
		}catch(NumberFormatException e){
			System.out.println("예외발생");
			System.err.println(e.getMessage());
			//err를 씀으로써 글씨가 빨갛게 변함
		}
	}

}
