package ch04.sec03;

import java.util.Scanner;

public class IfTestExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		//90=>A, 80=>B
		System.out.println(num);
		if(num>=90) {
			System.out.println("A");			
		} else if(num>=80) {
			System.out.println("B");			
		} else if(num>=70) {
			System.out.println("C");			
		} else if(num>=60) {
			System.out.println("D");				
		} else  {
			System.out.println("F");			
		}

	}

}
