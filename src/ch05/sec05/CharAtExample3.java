package ch05.sec05;

public class CharAtExample3 {
	public static void main(String[] args) {
//		미성년자인지? 경노우대사항인지 (만18세 미만 500원, 만 60세이상 0원, 일반인 1,000원)
//	    요금 과금
		
		String juminNum = "951222-1051454";
		char szSex = juminNum.charAt(7);
		int iYear = (szSex == '1' || szSex == '2')? 1900:2000;
		String strYear = ""+juminNum.charAt(0)+juminNum.charAt(1);
		iYear += Integer.parseInt(strYear);
		String strDate = ""+juminNum.charAt(2)+juminNum.charAt(3)+juminNum.charAt(4)+juminNum.charAt(5);
		int iDate = Integer.parseInt(strDate);			
		
		int today=20240812;	
		
		double age = (today - (iYear*10000)+iDate)/10000.0;
		
		if(age < 18) {
			System.out.println("당신은 500원입니다. 나이: "+age);
		} else  if(age > 60) {
			System.out.println("당신은 0원입니다. 나이: "+age);
		} else {
			System.out.println("당신은 1,000원입니다. 나이: "+age);
		}
	}
}