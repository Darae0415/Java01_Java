package ch09.sec06;

public class Button {
	//정적 멤버 인터페이스 (객체생성 생략가능)
	public static interface ClickListener{
		//추상 메소드 선언 ({} 생략)
		void onClick();
	}
	
	//필드 생성
	private ClickListener clickListener;
	
	//메소드 생성
	public void setClickLisetener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
