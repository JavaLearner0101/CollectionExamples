package com.method.returnObject.example;

public class Student {

	private int id;
	private String name;
	private String branch;
	private boolean hostelAcc;
	private String state;

	public Student(int id, String name, String branch, boolean hostelAcc, String state) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.hostelAcc = hostelAcc;
		this.state = state;
	}

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public boolean isHostelAcc() {
		return hostelAcc;
	}

	public void setHostelAcc(boolean hostelAcc) {
		this.hostelAcc = hostelAcc;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
