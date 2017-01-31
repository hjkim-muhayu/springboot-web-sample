package com.example.vo;

import org.apache.ibatis.type.Alias;

@Alias("SampleVO")
public class SampleVO {
	private int userSeq;
	private String userName;

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
