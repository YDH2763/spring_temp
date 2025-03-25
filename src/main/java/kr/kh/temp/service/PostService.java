package kr.kh.temp.service;

import java.util.List;

import kr.kh.temp.model.vo.BoardVO;

public interface PostService {

	boolean insertBoard(String name);

	List<BoardVO> getBoardList();

	boolean updateBoard(BoardVO board);

	boolean deleteBoard(int num);

}
