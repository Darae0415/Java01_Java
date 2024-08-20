package ch09.sec06;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		
		 class OkListener implements Button.ClickListener{
			 
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했음");
			}
		}

		btnOk.setClickLisetener(new OkListener());
		
		btnOk.click();
		//======================================
		Button btnCancel =new Button();
		
		 class CancelListener implements Button.ClickListener{
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했음");
			}
		}
		btnCancel.setClickLisetener(new CancelListener());
		btnCancel.click();
	}

}
