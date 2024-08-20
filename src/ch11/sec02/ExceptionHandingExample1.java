package ch11.sec02;

public class ExceptionHandingExample1 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재하다");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.leng.String2");
			System.out.println("java.lang.String2 클래스가 존재하다");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
