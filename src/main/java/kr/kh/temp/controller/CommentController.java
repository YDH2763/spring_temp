package kr.kh.temp.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.temp.pagination.Criteria;
import kr.kh.temp.service.CommentService;

@Controller
public class CommentController {

	@Autowired
	CommentService commentService;
	
	@ResponseBody
	@GetMapping("/comment/list")//또는 @PostMapping("경로")
	public Map<String, Object> 메서드명(@RequestBody Criteria cri){
		Map<String, Object> map = new HashMap<String, Object>();
		
		return map;
	}
}
