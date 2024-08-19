package ch08.sec01;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rct= new TV();
		
		rct.turnOn();
		rct.turnOff();
		
		System.out.printf("최대볼륨 : %d,최소볼륨 : %d\n", rct.MAX_VOLUME, rct.MIN_VOLUME);
		System.out.printf("최대볼륨 : %d,최소볼륨 : %d\n", RemoteControl.MAX_VOLUME, RemoteControl.MIN_VOLUME);
		
		rct.setVolume(6);
		TV tv = (TV)rct;
		// 다운캐스팅 부모타입(RemoteControl)으로 저장된 객체(rct)를 
		// 다시 TV타입으로 변환하는것.
		tv.printVolume();
		
		rct.setMute(true);
		tv.printVolume();
		rct.setMute(false);
		tv.printVolume();
		
		RemoteControl.changeBattery();
		rct.callParivateFunc();
		rct.callPrivateStaticFunc();
		
		System.out.println("---------------------------------------");
		rct = new Radio();
		rct.turnOn();
		rct.turnOff();
		
		System.out.printf("최대볼륨 : %d,최소볼륨 : %d\n", rct.MAX_VOLUME, rct.MIN_VOLUME);
		System.out.printf("최대볼륨 : %d,최소볼륨 : %d\n", RemoteControl.MAX_VOLUME, RemoteControl.MIN_VOLUME);
		
		rct.setVolume(50);
		Radio rdo = (Radio)rct;
		rdo.printVolume();
		
		rct.setMute(true);
		rdo.printVolume();
		rct.setMute(false);
		rdo.printVolume();
		
	}

}
