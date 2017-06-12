package com.fzu.shhtest.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CallTheRoll", catalog = "classcall")
public class CallTheRoll {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "autoid" , nullable = false)
	private long autoid;
	@Column(name = "courseName", nullable = false)
	private String courseName;
	@Column(name = "ID", nullable = false)
	private String ID;
	@Column(name = "callstate", nullable = false)
	private int callstate;
	@Column(name = "calldate", nullable = false)
	private Date calldate;
	@Column(name = "callposition", nullable = false)
	private String callposition;
	
	
/*
	private Course course;
	@ManyToOne
	@JoinColumn(name="courseName") 
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	*/
	
	public long getAutoid() {
		return autoid;
	}
	public void setAutoid(long autoid) {
		this.autoid = autoid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Date getCalldate() {
		return calldate;
	}
	public void setCalldate(Date calldate) {
		this.calldate = calldate;
	}
	public int getCallstate() {
		return callstate;
	}
	public void setCallstate(int callstate) {
		this.callstate = callstate;
	}
	public String getCallposition() {
		return callposition;
	}
	public void setCallposition(String callposition) {
		this.callposition = callposition;
	}
	
}