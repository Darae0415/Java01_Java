package ch06.sec10;

public class Television {

	static String company = "MyCompany"; //문자열이니까 ""필수
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
