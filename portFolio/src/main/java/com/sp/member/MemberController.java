package com.sp.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sp.common.FileManager;
import com.sp.common.MyUtil;

@Controller("member.memberController")
public class MemberController {
	@Autowired
	private FileManager fileManager;
	@Autowired
	private MyUtil myUtil;
	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/member/login", method=RequestMethod.GET)
	public String login(String login_error, Model model) {
		boolean bLoginChk = login_error != null;
		if(bLoginChk) {
			String msg = "아이디 또는 비밀번호가 일치하지 않습니다.";
			model.addAttribute("msg", msg);
		}
		
		return "login/login";
	}
	
	// 접근 권한이 없는 경우
	@RequestMapping(value="/member/noAuthorized")
	public String noAuthorized() {
		return ".error.noAuthorized";
	}
	
	// 세션이 만료된 경우
	@RequestMapping(value="/member/expired")
	public String expired() {
		return ".error.expired";
	}
}
