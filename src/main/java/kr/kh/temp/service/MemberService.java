package kr.kh.temp.service;

import kr.kh.temp.model.vo.MemberVO;

public interface MemberService {

	boolean signup(MemberVO member);

	MemberVO login(MemberVO member);

}
