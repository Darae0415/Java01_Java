package ch08.sec08;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rcTV = new SmartTV();
		rcTV.turnOn();
		rcTV.turnOff();
		
		RemoteControl rcSmartTV = new SmartTV();
		rcSmartTV.turnOn();
		rcSmartTV.turnOff();
		
		Searchable rcSmartTV2 = new SmartTV();
		rcSmartTV2.search("유튜브");
	}

}
