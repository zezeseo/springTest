package com.multi.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@ResponseBody    // 결과를 view 페이지를 통하지 않고 반환값을 HTTP Response Body에 직접 전송
	@RequestMapping("/")    // 요청 url : http://localhost:8080
	public String home() {
		System.out.println("Hello Boot!!");
		return "Hello boot!!";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "안녕하세요");
		return "hello"; // 뷰페이지 이름 : hello.jsp
	}
}
