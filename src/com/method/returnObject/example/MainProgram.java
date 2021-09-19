package com.method.returnObject.example;

public class MainProgram {

	public static void main(String[] args) {
		HashSetStudent hss = new HashSetStudent();
		Student student = new Student();
		student.setId(1);
		student.setName("Rajesh");
		student.setHostelAcc(true);
		student.setBranch("CS");
		student.setState("AP");
		hss.add(student);
		student.setId(2);
		student.setName("Ritesh");
		student.setHostelAcc(false);
		student.setBranch("CS");
		student.setState("Bihar");
		hss.add(student);

		student = hss.find(4);
		if (student.getName() == null) {
			System.out.println("No student with that ID");
		} else {
			System.out.println(student.getName());
		}
	}

}
