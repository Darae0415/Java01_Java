package ch11.sec02;

public class ExceptionHandlingExample {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수 : "+result);
	}
	public static void printLength2(String data) {
		try {
			int result2 = data.length();
			System.out.println("문자 수 : "+result2);
		} 
		catch(NullPointerException e) {
			System.out.println("예외 발생1!" + e.getMessage());
			System.out.println("예외 발생2!" + e.toString());
			e.printStackTrace();
		}
		finally {
			System.out.println("작업종료");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength2("ThisIsJava");
//		printLength2(null);
		System.out.println("[프로그램 종료]");
	}

}
