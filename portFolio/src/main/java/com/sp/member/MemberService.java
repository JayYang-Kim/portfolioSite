package com.sp.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.common.FileManager;
import com.sp.common.MyUtil;
import com.sp.common.dao.CommonDAO;

@Service("member.memberService")
public class MemberService {
	@Autowired
	private FileManager fileManager;
	@Autowired
	private CommonDAO dao;
	@Autowired
	private MyUtil myUtil;
	
	public Member readLoginInfo(String userId) {
		Member member = null;
		try {
			member = dao.selectOne("member.readLoginInfo", userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return member;
	}
}
