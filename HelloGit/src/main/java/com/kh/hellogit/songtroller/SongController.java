package com.kh.hellogit.songtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {

	@RequestMapping("insert.do")
	public String insertBoard(String bid) {
		return null;
	}

}
