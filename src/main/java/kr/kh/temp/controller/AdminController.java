package kr.kh.temp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.kh.temp.service.PostService;

@Controller
public class AdminController {

	@Autowired
	private PostService postService;
}
