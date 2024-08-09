package ch03.sec07;

public class Logica10peratorExample {

	public static void main(String[] args) {
		int charCode = '1';

        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.printf("%c는 대문자입니다.\n", (char)charCode);
        }
        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.printf("%c는 소문자입니다.\n", (char)charCode);
        }
        if ((48 <= charCode) && (charCode <= 57)) { 
            System.out.printf("%c는 숫자형입니다.\n", (char)charCode);
        }
		
		int num=9;
		
		if(num%2 == 0) {
			System.out.printf("%d는 2의 배수\n",num);
		}
		if(num%3 == 0) {
			System.out.printf("%d는 3의 배수\n",num);
		}
		
		if(num%2 == 0 && num%3 == 0) {
			System.out.printf("%d는 2와 3의 배수\n",num);
		}
		if(num%3 == 0 || num%3 == 0) {
			System.out.printf("%d는 2와 3의 중 1개 이상의 배수\n",num);
		}

	}

}
