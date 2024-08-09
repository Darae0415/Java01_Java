package ch04.sec01;

import java.util.Scanner;

public class sample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);
		System.out.println(num);
	    
	    switch(num/10) {
	    case 10:System.out.println('S'); break;
	    case 9: System.out.println('A'); break;
	    case 8: System.out.println('B'); break;
	    case 7: System.out.println('C'); break;
	    case 6: System.out.println('D'); break;
	    default: System.out.println('F'); break;
	    }
	    scan.close();
	}
}
