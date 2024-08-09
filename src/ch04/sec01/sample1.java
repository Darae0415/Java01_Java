package ch04.sec01;

import java.util.Scanner;

public class sample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num =Integer.parseInt(input);
		
	    System.out.println(num);
	    if(num>=90) {
	    	System.out.println("A");
	    }else if(num>=80) {
	    	System.out.println("B");
	    }
	    else if(num>=70) {
	    	System.out.println("C");
	    }
	    else if(num>=60) {
	    	System.out.println("D");
	    }
	    else {
	    	System.out.println("F");
	    }
	}

}
