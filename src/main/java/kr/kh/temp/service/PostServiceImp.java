package kr.kh.temp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.temp.dao.PostDAO;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostDAO postDao;
}
