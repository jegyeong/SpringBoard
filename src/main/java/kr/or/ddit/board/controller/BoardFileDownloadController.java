package kr.or.ddit.board.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.AttatchVO;

@Controller
public class BoardFileDownloadController {
	@Inject
	IBoardService service;
	
	@GetMapping("/board/file/{att_no}")
	public String download(@PathVariable(required = true) int att_no, Model model){
		AttatchVO attatch = service.downloadAttatch(att_no);
		
		model.addAttribute("attatch", attatch);
		 
		return "downloadView"; 
	}
}









