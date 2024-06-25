package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu1 = new Student();
		//1) using object reference variables
		/*
		stu1.sid = 101;
		stu1.sname = "Pruthvi";
		stu1.grade = 'A';
		stu1.printStudentData();
		*/
		
		//2) using method
		//stu1.setStudentData(101, "pruthvi", 'A');
		//stu1.printStudentData();
		
		//3) using constructor
		Student stu1 = new Student(101, "Jainal", 'A');
		stu1.printStudentData();
		
		
		
	}

}
