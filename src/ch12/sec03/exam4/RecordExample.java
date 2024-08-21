package ch12.sec03.exam4;

public class RecordExample {

	public static void main(String[] args) {
		Member m = new Member("winter","눈송이",25);
		System.out.printf("아이디: %s, 아이디: %s, 나이: %d\n",m.id(),m.name(),m.age());
		System.out.println(m.toString());
		
		Member m1=new Member("winter","눈송이",25);
		Member m2=new Member("winter","눈송이",25);
		System.out.printf("해시코드(m1): %d, 해시코드(m2): %d\n",m1.hashCode(),m2.hashCode());
		
		System.out.printf("m1 == m2 : %s\n", m1==m2);
		System.out.printf("m1.equals(m2) : %s\n", m1.equals(m2));

	}

}
