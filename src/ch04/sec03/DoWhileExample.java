package ch04.sec03;
import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하시려면 q를 입력하세요");
		Scanner scan=new Scanner(System.in);
		String strInput="";
		
		do {
			System.out.print(">");
			strInput=scan.nextLine();
			System.out.print(strInput);
		} while(strInput.equals("q")==false);
	scan.close();
	}
	

}
