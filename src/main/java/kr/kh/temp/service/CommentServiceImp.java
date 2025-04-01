package kr.kh.temp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.temp.dao.CommentDAO;
import kr.kh.temp.model.vo.CommentVO;
import kr.kh.temp.model.vo.MemberVO;

@Service
public class CommentServiceImp implements CommentService{

	@Autowired
	CommentDAO commentDao;

	@Override
	public boolean insertComment(CommentVO comment, MemberVO user) {
		if(comment == null /*|| user == null*/) {
			return false;
		}
		comment.setCo_me_id("asd");
		return commentDao.insertComment(comment);
	}

	
	
	
}
