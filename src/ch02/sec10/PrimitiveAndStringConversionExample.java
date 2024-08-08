package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		int intValue = Integer.parseInt("10");
		System.out.println(intValue + 1);
		
		double doubleValue = Double.parseDouble("10.123");
		System.out.println(doubleValue);
		
		boolean boolValue = Boolean.parseBoolean("TrUe");
		System.out.println(boolValue);
		
		String strTempo = String.valueOf(10);
		System.out.println(strTempo + 10);		

		strTempo = String.valueOf(3.14);
		System.out.println(strTempo + 10);
		
		strTempo = String.valueOf(true);
		System.out.println(strTempo + 10);
		
	}
}