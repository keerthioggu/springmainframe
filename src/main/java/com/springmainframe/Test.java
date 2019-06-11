package com.springmainframe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class Test {

		
		@RequestMapping(value="/fetchAllRecords")
		public String accessDenied() {
			return "";
		}
		public static void main(String[] args) {
			System.out.println("welcome!!");
		}

	}


