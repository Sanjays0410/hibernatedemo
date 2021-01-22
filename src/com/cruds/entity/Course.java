package com.cruds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {

	private long courseId;
	private String courseName;
	
	public Course() {
		
	}

	public Course( String courseName) {
		super();
		
		this.courseName = courseName;
	}

	@Id
	@GeneratedValue
	@Column(name="COURSE_ID")

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Column(name="COURSE_NAME", nullable=false)
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

	
}
