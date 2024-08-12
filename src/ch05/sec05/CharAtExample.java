package ch05.sec05;



public class CharAtExample {

	public static void main(String[] args) {

		String JuminNum = "011222-3051454";
		char sex = JuminNum.charAt(7);
		System.out.println(sex);

		char[] juminArr = {'0','1','1','2','2','2','-','3','0','5','1','4','5','4'};
		char sex2 = juminArr[7];
		System.out.println(sex2);
		
		
	}

}
