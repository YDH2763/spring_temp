package kr.kh.temp.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.temp.model.vo.MemberVO;

public interface MemberDAO {

	boolean insertMember(@Param("member")MemberVO member);

}
