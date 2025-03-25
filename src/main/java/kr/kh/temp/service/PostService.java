package kr.kh.temp.service;

import java.util.List;

import kr.kh.temp.model.vo.BoardVO;
import kr.kh.temp.model.vo.MemberVO;
import kr.kh.temp.model.vo.PostVO;

public interface PostService {

	boolean insertBoard(String name);

	List<BoardVO> getBoardList();

	boolean updateBoard(BoardVO board);

	boolean deleteBoard(int num);

	List<PostVO> getPostList(Integer bo_num);

	boolean insertPost(PostVO post, MemberVO user);

	void updateView(int po_num);

	PostVO getPost(int po_num);

	boolean deletePost(int po_num, MemberVO user);

	boolean updatePost(PostVO post, MemberVO user);

}
