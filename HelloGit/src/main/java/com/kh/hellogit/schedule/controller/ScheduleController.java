package com.kh.hellogit.schedule.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class ScheduleController {
	@RequestMapping("insert.sc")
	public String insertSchedule(String name, String place) {
		
		return "home";
	}
}
