package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.MemberDAO;
import com.example.demo.Model.MemberAccount;

@Service
public class MemberService {

	@Autowired
	MemberDAO memberDao;
	
	public void addMember(MemberAccount member) {
		memberDao.addMember(member);
	}
	
	
}
