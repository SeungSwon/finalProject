package com.kh.hellogit.approval.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApprovalController {
	@RequestMapping("insert.do")
		public String insertApproval(String id, String content) {
			return "approval";
	}
}
