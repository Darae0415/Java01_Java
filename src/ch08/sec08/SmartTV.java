package ch08.sec08;

public class SmartTV implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println("SmartTV searching : "+ url);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("SmartTV off");
	}

}
