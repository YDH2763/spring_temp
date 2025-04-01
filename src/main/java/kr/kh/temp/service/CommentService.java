package kr.kh.temp.service;

import kr.kh.temp.model.vo.CommentVO;
import kr.kh.temp.model.vo.MemberVO;

public interface CommentService {

	boolean insertComment(CommentVO comment, MemberVO user);

}
