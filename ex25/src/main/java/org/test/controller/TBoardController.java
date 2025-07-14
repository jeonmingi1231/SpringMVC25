package org.test.controller;

import org.test.domain.TBoardVO;
import org.test.service.TBoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller 
@Log4j2
@RequestMapping("/tboard/*")
@AllArgsConstructor 
public class TBoardController {

	private TBoardService service; // Service 주입

	// 등록 화면 이동 (등록 폼)
	@GetMapping("/register")
	public String register() {
		return "/tboard/register";  // register.jsp 페이지로 이동
	}

	// 등록 처리
	@PostMapping("/register")
	public String register(TBoardVO board, RedirectAttributes rttr) {

		log.info("TBoardController.register 메서드 실행.....");

		service.register(board);  // 등록 처리
		rttr.addFlashAttribute("result", board.getBno());  // 등록 성공 메시지 전달

		return "redirect:/tboard/register";  // 성공 후 다시 등록 페이지로 이동 
	}
}
