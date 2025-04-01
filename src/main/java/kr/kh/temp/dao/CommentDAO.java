package kr.kh.temp.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.temp.model.vo.CommentVO;

public interface CommentDAO {

	boolean insertComment(@Param("co")CommentVO comment);

}
