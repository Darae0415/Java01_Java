package ch12.sec03;

import java.lang.annotation.Target;

public class Member {
	public String id; //필드
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
	  //if(obj instanceof Member m){
      //    Member m = (Member) obj; 로도 가능
			
			if(id.equals(target.id)) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}
