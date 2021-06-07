package net.developia.sec.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/ex1")
public class SecurityTestController {
	@RequestMapping("/")
	public String root() {
		return "redirect:index";
	}

	@RequestMapping("/index")
	public String index() {

		log.info("-----------------------------------------------");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		log.info("user name       : " + auth.getName());
		log.info("credential      : " + auth.getCredentials());
		log.info("user info       : " + auth.getPrincipal());
		log.info("detail          : " + auth.getDetails().toString());
		log.info("isAuthenticated : " + auth.isAuthenticated());
		log.info("user role       : " + auth.getAuthorities().toString());
		log.info("-----------------------------------------------");

		return "sec_view/index";
	}

	@RequestMapping("/home/main")
	public String home() {
		return "sec_view/homeMain";
	}

	@RequestMapping("/manager/main")
	public String manager() {
		return "sec_view/managerMain";
	}

	@RequestMapping("/admin/main")
	public String admin() {
		return "sec_view/adminMain";
	}

	@RequestMapping("/member/main")
	public String member() {
		return "sec_view/memberMain";
	}
}
