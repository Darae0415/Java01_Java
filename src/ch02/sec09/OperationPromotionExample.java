package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteresult = 10+20;
		System.out.println("byteresult: "+byteresult);
		
		byte v1=10;
		byte v2=20;
		byteresult=(byte)(v1+v2);
		int intresult=v1+v2;
		System.out.println("byteresult: "+byteresult);
		System.out.println("intresult: "+intresult);
		
		byte v3=10;
		int v4=100;
		long v5=1000L;
//		short shortresult(short)(v3+v4+v5);
		long longresult=v3+v4+v5;
//		System.out.println("shortresult: "+shortresult);
		System.out.println("longresult: "+longresult);
		
		char v6='A';
		char v7=1;
		char charresult=(char)(v6+v7);
		intresult = v6+v7;
		
		int v8 = 10;
		intresult = 10/4;
		System.out.println("intresult: "+intresult);
		
		int v9=10;
		double doubleresult =v9/4.0;
		System.out.println("doubleresult: "+doubleresult);
		
		int v10=1;
		int v11=2;
		doubleresult =(double) (v10/v11);
		System.out.println("doubleresult: "+doubleresult);
	}

}
