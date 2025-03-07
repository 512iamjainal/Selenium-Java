package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.ename="jai";
		emp1.job = "manager";
		emp1.sal=4000;
		emp1.display();
		
		Employee emp2 = new Employee();
		emp1.eid = 102;
		emp1.ename="milan";
		emp1.job = "qa";
		emp1.sal=9000;
		emp1.display();

	}

}
