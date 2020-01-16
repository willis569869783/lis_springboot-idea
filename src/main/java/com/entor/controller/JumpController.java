package com.entor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/a")
	public String a() {
		return "vip-user";
	}

	// 加载子视图
	@RequestMapping("/vip-user.html")
	public String firstpage() {
		return "vip-user";
	}

	@RequestMapping("/waybill.html")
	public String firstpage2() {
		return "waybill";
	}

	@RequestMapping("/goods.html")
	public String firstpage3() {
		return "goods";
	}
}
