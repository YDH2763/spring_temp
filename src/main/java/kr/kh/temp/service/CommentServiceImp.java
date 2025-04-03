package kr.kh.temp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.temp.dao.CommentDAO;
import kr.kh.temp.model.vo.CommentVO;
import kr.kh.temp.model.vo.MemberVO;
import kr.kh.temp.pagination.CommentCriteria;
import kr.kh.temp.pagination.Criteria;
import kr.kh.temp.pagination.PageMaker;

@Service
public class CommentServiceImp implements CommentService{

	@Autowired
	CommentDAO commentDao;

	@Override
	public boolean insertComment(CommentVO comment, MemberVO user) {
		if(comment == null || user == null) {
			return false;
		}
		return commentDao.insertComment(comment);
	}

	@Override
	public List<CommentVO> getCommentList(Criteria cri) {
		if(cri==null) {
			return null;
		}
		return commentDao.selectCommentList(cri);
	}

	@Override
	public PageMaker getPageMaker(Criteria cri) {
		if(cri == null) {
			return null;
		}
		int count=commentDao.selectPageMake(cri);
		return new PageMaker(3,cri,count);
	}

	@Override
	public boolean deleteComment(int co_num, MemberVO user) {
		
		if(user==null) {
			return false;
		}
		
		CommentVO comment = commentDao.selectComment(co_num);	
		if(comment == null) {
			return false;
		}
		
		if(!comment.getCo_me_id().equals(user.getMe_id())) {
			return false;
		}
		return commentDao.deleteComment(comment);
	}

	@Override
	public boolean updateComment(CommentVO comment, MemberVO user) {
		if(comment == null || user == null ) {
			return false;
		}
		CommentVO dbComment = commentDao.selectComment(comment.getCo_num());
		
		if(dbComment == null || !dbComment.getCo_me_id().equals(user.getMe_id())) {
			return false;
		}
		return commentDao.updateComment(comment);
	}

	

	
	

	
	
	
}
