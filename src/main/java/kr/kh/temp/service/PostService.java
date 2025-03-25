package kr.kh.temp.service;

import java.util.List;

import kr.kh.temp.model.vo.BoardVO;
import kr.kh.temp.model.vo.PostVO;

public interface PostService {

	boolean insertBoard(String name);

	List<BoardVO> getBoardList();

	boolean updateBoard(BoardVO board);

	boolean deleteBoard(int num);

	List<PostVO> getPostList(Integer bo_num);

}
