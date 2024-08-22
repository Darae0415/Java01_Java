package ch12.sec06;

public class MemberExample {

	public static void main(String[] args) {
		User usr = new User();
		usr.setId("spring");
		
		Member mbr = new Member();
		mbr.setId("fall");
		mbr.setName("한가을");
		mbr.setAge(10);
		System.out.println(mbr.getName()+" , "+
		mbr.getId()+" , "+mbr.getAge());

	}

}
