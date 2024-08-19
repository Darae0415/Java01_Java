package ch08.sec01;

public class TV implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");

	}
	
	int memoryVolume;

	@Override
	public void setMute(boolean mute) {
		if(mute) {			
			this.memoryVolume = this.volume;   //묵음요청이면 현재볼륨을 임시저장
			RemoteControl.super.setMute(mute); //현재볼륨을 최소값(0)으로
		} else {
			this.volume = this.memoryVolume;   //임시저장 볼륨값을 현재볼륨값으로 
			RemoteControl.super.setMute(mute); //묵음해제하기 호출			
		}
		
	}

	@Override
	public void setVolume(int volume)  {
		this.volume = volume;
		if(volume < this.MIN_VOLUME) { //int형(정수형)으로 받아온 volume값이 설정된 MIN_VOLUME값보다 작으면
			this.volume = this.MIN_VOLUME; // 설정되어 있는 MIN_VOLUME값을 volume으로 저장(0)
		}else if(volume > this.MAX_VOLUME) { //아니면 int형으로 받아온 voluem값이 MAX_VOLUME값보다 높으면
			this.volume = this.MAX_VOLUME; // 설정되어 있는 MAX_VOLUME값을 volume으로 저장(10)
		}else {
			this.volume = volume; //그것도 아니면 volume값을(0~10사이)volume에 다시 넣는다
		}
	}
	
	public void printVolume() {
		System.out.println("TV볼륨: " + volume);		
	}

}