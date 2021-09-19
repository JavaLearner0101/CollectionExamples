package com.method.returnObject.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetStudent {

	Student student = new Student();
	Set<Student> studentHashSet = new HashSet<Student>();
	
	public void add(Student student)
	{
		studentHashSet.add(new Student(student.getId(), student.getName(),student.getBranch(),student.isHostelAcc(),student.getState()));
	}
	public Student find(int id){
		for(Student st : studentHashSet)
			if (st.getId() == id) {
				student.setId(st.getId()); 
				student.setName(st.getName());
				student.setBranch(st.getBranch());
				student.setHostelAcc(st.isHostelAcc());
				student.setState(st.getState());
				}
		return student;
	}
}
