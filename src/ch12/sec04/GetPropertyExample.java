package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		//운영체계정보

		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String osHome = System.getProperty("user.home");
		System.out.println("운영체계 : "+ osName);
		System.out.println("사용자이름 : "+ userName);
		System.out.println("사용자 홈 : "+osHome);
		System.out.println();
		
		System.out.println("--------------------------");
		System.out.println("key : value");
		System.out.println("--------------------------");
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s : %s\n",key,value);
		}
	}

}
