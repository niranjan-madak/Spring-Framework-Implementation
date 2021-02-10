package com.madak;

public class Data {
	private int roll;
	private String name;
	private String college;
	private String course;
	private String branch;
	private String university;
	private String college_address;
	private String passout_year;
	private String division;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCollege_address() {
		return college_address;
	}
	public void setCollege_address(String college_address) {
		this.college_address = college_address;
	}
	public String getPassout_year() {
		return passout_year;
	}
	public void setPassout_year(String passout_year) {
		this.passout_year = passout_year;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Data(int roll, String name, String college, String course, String branch, String university,
			String college_address, String passout_year, String division) {
		super();
		this.roll = roll;
		this.name = name;
		this.college = college;
		this.course = course;
		this.branch = branch;
		this.university = university;
		this.college_address = college_address;
		this.passout_year = passout_year;
		this.division = division;
	}
	@Override
	public String toString() {
		return "Data [roll=" + roll + ", name=" + name + ", college=" + college + ", course=" + course + ", branch="
				+ branch + ", university=" + university + ", college_address=" + college_address + ", passout_year="
				+ passout_year + ", division=" + division + "]";
	} 
	

}
