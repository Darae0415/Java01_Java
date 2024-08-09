package ch04.sec03;

import java.util.Scanner;

public class SwitchTest2Exmaple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input)/10;
		
		switch(num) {
		case 10, 9->{
			System.out.println("A");}
		case 8->{
			System.out.println("B");}
		case 7->{
			System.out.println("C");}
		case 6->{
			System.out.println("D");}
		default->{
			System.out.println("F");}
		}


	}

}
