package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder();
		sbr.append("DEF");
		System.out.println(sbr.toString());
		sbr.insert(0, "ABC");
		System.out.println(sbr.toString());
		sbr.delete(3, 5); //3부터 4까지 =>3초과 4이하
		sbr.reverse(); //거꾸로
		System.out.println(sbr.toString());
	}

}
