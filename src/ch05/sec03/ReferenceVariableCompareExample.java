package ch05.sec03;

import java.util.Arrays;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println("arr1("+arr1+")=> "+Arrays.toString(arr1));
		System.out.println("arr2("+arr2+")=> "+Arrays.toString(arr2));
		System.out.println("arr3("+arr3+")=> "+Arrays.toString(arr3));
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
	}

}
