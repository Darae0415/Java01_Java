package ch13.sec05;

public class MainExample {

	public static void main(String[] args) {
		Course.regCourseAll(new Applicant<Person>(new Person()));
		Course.regCourseAll(new Applicant<Worker>(new Worker()));
		Course.regCourseAll(new Applicant<Student>(new Student()));
		Course.regCourseAll(new Applicant<HighStudent>(new HighStudent()));
		Course.regCourseAll(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}
