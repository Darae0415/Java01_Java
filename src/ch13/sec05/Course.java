package ch13.sec05;

public class Course {
	public static void regCourseAll(Applicant<?> app) {
		System.out.println(app.kind.getClass().getSimpleName()
				+"이 코스1(전체코스) 등록함");
	}
	public static void regCourseStudent(Applicant<? extends Student> app) {
		System.out.println(app.kind.getClass().getSimpleName()
				+"이 코스2(학생만) 등록함");
	}
	public static void regCourseWorker(Applicant<? super Worker> app) {
		System.out.println(app.kind.getClass().getSimpleName()
				+"이 코스3(일반인 & 직장인만) 등록함");
	}
}
