package com.entor.entity;

public class Result {

	private int statue;
	private String msg;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int statue, String msg) {
		super();
		this.statue = statue;
		this.msg = msg;
	}

	public int getStatue() {
		return statue;
	}

	public void setStatue(int statue) {
		this.statue = statue;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
