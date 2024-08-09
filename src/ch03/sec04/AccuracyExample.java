package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple =1;
		double pieceUnit=0.1;
		int number=7;
		
		double result =apple - number*pieceUnit;
		System.out.println("남은양: "+result);
		
		double result2 =(apple*10 - number*(pieceUnit*10))/10;
		System.out.println("남은양: "+result2);
		
		double result3 =((apple*10 - number*(pieceUnit*10)))/10;
		System.out.println("남은양: "+result3);
		
	}

}
