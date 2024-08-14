package ch07.sec02;

public class SmartphoneExample {

	public static void main(String[] args) {
		//SmartPhone 객체를 생성 및 선언
		SmartPhone myPhone = new SmartPhone("갤럭시","은색");
		
		//Phone 으로부터 상속받은 필드 읽기
		System.out.println("모델 : "+myPhone.model);
		System.out.println("색상 : "+myPhone.color);
		
		//SmartPhone의 필드를 읽기
		System.out.println("와이파이 상태 : "+myPhone.wifi);
		
		//Phone으로부터 상속받은 메소드를 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요?");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		myPhone.sendVoice("아~ 네 반갑습니다.");
		myPhone.handup();
	}

}
