package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		String[] strArr=new String[3];
		strArr[0]="Java";
		strArr[1]="Java";
		strArr[2]=new String("Java");

		System.out.println(strArr[0] == strArr[1]);  //객체는 같음
		System.out.println(strArr[0] == strArr[2]);  //new 로 인해 다른 객체를 참조
		System.out.println(strArr[0].equals(strArr[2])); //true
		
	}

}
