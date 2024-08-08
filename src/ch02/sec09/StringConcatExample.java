package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		int intresult=10+2+8;
		System.out.println(intresult);
		
		String strresult=10+2+"8";
		System.out.println(strresult);
		
		strresult=10+"2"+8;
		System.out.println(strresult);
		
		strresult="10"+2+8;
		System.out.println(strresult);
		
		strresult="10"+(2+8);
		System.out.println(strresult);
	}

}
