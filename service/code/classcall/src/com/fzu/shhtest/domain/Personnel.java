package com.fzu.shhtest.domain;

public class Personnel {
	private String ID;
	private String Ppassword;
	private String Pname;
	private int major;
	private int role;
	private int pclass;

	
	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPpassword() {
		return Ppassword;
	}


	public void setPpassword(String ppassword) {
		Ppassword = ppassword;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}


	public int getMajor() {
		return major;
	}


	public void setMajor(int major) {
		this.major = major;
	}


	public int getRole() {
		return role;
	}


	public void setRole(int role) {
		this.role = role;
	}


	public int getPclass() {
		return pclass;
	}


	public void setPclass(int pclass) {
		this.pclass = pclass;
	}


	public String toString() {
		return ID+"   "+Ppassword+"     "+Pname+"    "+"    "+major+"    "+role;
        //return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

}

/*
 * ԭ�� ���ݿ�ı�����ΪСд��ĸ���ఴ�շ巨���� ��ı��������ݿ���б�һ��
 */