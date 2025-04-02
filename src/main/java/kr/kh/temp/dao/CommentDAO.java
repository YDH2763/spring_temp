package kr.kh.temp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.kh.temp.model.vo.CommentVO;
import kr.kh.temp.pagination.CommentCriteria;
import kr.kh.temp.pagination.Criteria;
import kr.kh.temp.pagination.PageMaker;

public interface CommentDAO {

	boolean insertComment(@Param("co")CommentVO comment);

	List<CommentVO> selectCommentList(@Param("cri")Criteria cri);

	int selectPageMake(@Param("cri")Criteria cri);

	CommentVO selectComment(@Param("co_num")int co_num);

	boolean deleteComment(@Param("co")CommentVO comment);

}
