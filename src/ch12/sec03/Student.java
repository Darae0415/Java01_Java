package ch12.sec03;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public int hashCode() {
		int hashcode = no + name.hashCode();
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if((this.no == target.no)&&(this.name.equals(target.name))) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		
		return "학번: "+this.no+" 이름: "+this.name;
	}
	
	
}
