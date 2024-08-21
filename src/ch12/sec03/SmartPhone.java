package ch12.sec03;

public class SmartPhone {
	//필드
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		
		return company + " , " + os;
	}
	
	
}
