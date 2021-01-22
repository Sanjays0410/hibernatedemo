package com.cruds.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "STUDENT")

public class Student {

	private long studentId;
	private String studentName;
	private Address studentAddress;
	private Set<Phone> studentPhoneNumbers = new HashSet<Phone>();
	private Set<Course> courses = 
			new HashSet<Course>();

	
	
	 public Student() {
		// TODO Auto-generated constructor stub
	}
	 
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name = "STUDENT_COURSE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COURSE_ID") })

	 public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	public Student( String studentName, Address studentAddress) {
		super();
		
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}


	@Id
	 @GeneratedValue
	 @Column(name = "STUDENT_ID")

	public long getStudentId() {
		return studentId;
	}
	
	

	/*public Student( String studentName, Set<Phone> studentPhoneNumbers) {
		super();
		
		this.studentName = studentName;
		
		this.studentPhoneNumbers = studentPhoneNumbers;
	}
*/

	

	
	
	public Student(String studentName, Set<Course> courses) {
		super();
		this.studentName = studentName;
		this.courses = courses;
	}


	public Student(String studentName, Address studentAddress, Set<Phone> studentPhoneNumbers, Set<Course> courses) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNumbers = studentPhoneNumbers;
		this.courses = courses;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_PHONE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
	public Set<Phone> getStudentPhoneNumbers() {
		return studentPhoneNumbers;
	}


	public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers) {
		this.studentPhoneNumbers = studentPhoneNumbers;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	@Column(name = "STUDENT_NAME", nullable = false, length = 100)

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@ManyToOne(cascade = CascadeType.ALL)
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}


	
}
