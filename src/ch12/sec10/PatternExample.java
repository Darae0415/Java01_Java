package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-2345-6789";
		
		boolean result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치함");
		}else {
			System.out.println("정규식과 일치하지 않음");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "ekfogksmf@navercom";
		
		result = Pattern.matches(regExp, data);
		
		if(result) {
			System.out.println("정규식과 일치함");
		}else {
			System.out.println("정규식과 일치하지 않음");
		}
	}

}
