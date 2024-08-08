package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String strX = scan.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력: ");
        String strY = scan.nextLine();
        int y = Integer.parseInt(strY);

        System.out.printf("%d + %d = %d\n", x, y, x + y);
        System.out.printf("%d - %d = %d\n", x, y, x - y);
        System.out.printf("%d * %d = %d\n", x, y, x * y);
        System.out.printf("%d / %d = %.2f\n", x, y, (double)x / y);
        
        scan.close();
	}

}
