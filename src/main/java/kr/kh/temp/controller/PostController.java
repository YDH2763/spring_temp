package kr.kh.temp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.kh.temp.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	
	
	@Autowired
	private PostService postService;
	
	
}
