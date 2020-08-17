package com.kh.hellogit.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberHyun {
	@RequestMapping("login.do")
	public String memberLogin(String id, String pwd) {
		return "home";
	}

}
