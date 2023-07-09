package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.MemberAccount;
import com.example.demo.Service.MemberService;
import com.example.demo.Service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	
	@GetMapping("/")
	public String home(@RequestParam(value="title", required=false, defaultValue="xiao") String title, Model model) {
	     	
	        return "index";
	}
	
	@GetMapping("/SelfIntroduction")
	public String SelfIntroduction( Model model) {
	     	
	        return "SelfIntroduction";
	}
	@GetMapping("/autobiography")
	public String RightSide( Model model) {
	     	
	        return "right-sidebar";
	}
	@GetMapping("/workexperience")
	public String NoSide( Model model) {
	     	
	        return "no-sidebar";
	}
	
	
	
	
}
