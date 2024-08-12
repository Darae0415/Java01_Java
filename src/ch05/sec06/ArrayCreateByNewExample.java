package ch05.sec06;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int [] arr1 = new int[3];
		for(int i = 0; i< 3; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}

		arr1[0] =10;
		arr1[1] =20;
		arr1[2] =30;

		for(int i = 0; i< 3; i++) {
			System.out.println("arr1["+i+"]:"+arr1[i]);
		}
		
		
		String[] arr3 = new String[3];
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);			
		}
		arr3[0]="토끼";
		arr3[1]="거북이";
		arr3[2]="야옹이";

		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+arr3[i]);			
		}

		System.out.printf("arr3 : %s \n",  System.identityHashCode(arr3));
		System.out.println("----------------");	
		
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+System.identityHashCode(arr3[i]));			
		}

		System.out.println("----------------");		
		arr3[0]="카멜레온";
		arr3[1]="토끼2";
		for(int i = 0; i<3; i++) {
			System.out.println("arr3["+i+"]:"+System.identityHashCode(arr3[i]));			
		}
	}

}
