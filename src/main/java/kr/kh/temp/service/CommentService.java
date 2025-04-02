package kr.kh.temp.service;

import java.util.List;

import kr.kh.temp.model.vo.CommentVO;
import kr.kh.temp.model.vo.MemberVO;
import kr.kh.temp.pagination.CommentCriteria;
import kr.kh.temp.pagination.Criteria;
import kr.kh.temp.pagination.PageMaker;

public interface CommentService {

	boolean insertComment(CommentVO comment, MemberVO user);

	List<CommentVO> getCommentList(Criteria cri);

	PageMaker getPageMaker(Criteria cri);

	boolean deleteComment(int co_num, MemberVO user);

	

}
