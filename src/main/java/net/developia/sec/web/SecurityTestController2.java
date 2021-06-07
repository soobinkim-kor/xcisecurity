package net.developia.sec.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityTestController2 {
	@RequestMapping("/")
	public String root() {
		return "redirect:index";
	}

	@RequestMapping("/index")
	public String index() {
		return "sec_view2/index";
	}

	@RequestMapping("/admin/usermanager/main")
	public String home() {
		return "sec_view2/usermanagerMain";
	}

	@RequestMapping("/member/main")
	public String manager() {
		return "sec_view2/memberMain";
	}
}
