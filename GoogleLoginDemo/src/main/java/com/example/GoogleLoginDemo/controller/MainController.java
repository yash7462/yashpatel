package com.example.GoogleLoginDemo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.GoogleLoginDemo.service.UserService;

@Controller
public class MainController {
	@Autowired
	UserService userservice;

	@RequestMapping("/")
	public String showform() {

		return "getdata";
	}

	@RequestMapping("/user")
	@ResponseBody
	public String loginwithgoogle() {

		return "hello world";
	}

	@RequestMapping("/showinformation")
	@ResponseBody
	public String user(@AuthenticationPrincipal OAuth2User principal, Model m) {
		// String name = Collections.singletonMap("Name",
		// principal.getAttribute("name"));

		// UserDetail user = new UserDetail();

		m.addAttribute("command", userservice.save(principal));

		// user.setEmail(principal.getAttribute("email"));
		// user.setName(principal.getAttribute("name"));
		// dao.save(user);

		return "getdata";

	}

	@RequestMapping("/showall")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}

}
