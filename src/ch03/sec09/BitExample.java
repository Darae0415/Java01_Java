package ch03.sec09;

public class BitExample {

	public static void main(String[] args) {
		byte leds = (byte)0b11101101; //76543210 순
		
		for(int index=0; index<8; index++) {
			byte chk_led = (byte)(1<<index);
		    if((leds & chk_led) == chk_led) {
		    	System.out.printf("%d램프가 켜져있습니다.\n",index);
		    } else {
		    	System.out.printf("%d램프가 꺼져있습니다.\n",index);
		    }
		}
		

	}

}
