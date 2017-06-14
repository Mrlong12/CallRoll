package com.fzu.shhtest.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SchoolInfo", catalog = "classcall")
public class SchoolInfo {
	@Id
	@Column(name = "school")
	private String school;
	@Column(name = "college")
	private String college;
	@Column(name = "department")
	private String department;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}

/*
 * ԭ�� ���ݿ�ı�����ΪСд��ĸ���ఴ�շ巨���� ��ı��������ݿ���б�һ��
 */









