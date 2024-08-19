package ch08.sec08;

public class ServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();
		
		//디폴트 메소드 호출(변수명.메소드명)
		service.defaultMethod1();
		System.out.println(); //줄바꿈을 한 것
		service.defaultMethod2();
		System.out.println();
		
		//정적 메소드 호출 (class명.메소드명)
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();
	}

}
