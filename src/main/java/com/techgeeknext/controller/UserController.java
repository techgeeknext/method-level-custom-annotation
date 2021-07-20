package com.techgeeknext.controller;

import javax.servlet.http.HttpServletRequest;

import com.techgeeknext.custom.annotation.AuthorizeUser;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

	/**
	 * Method to validate if user is valid or not by using AuthorizeUser annotation.
	 * @param user_id
	 * @param servletRequest
	 * @return
	 */
	@GetMapping("/login")
	@AuthorizeUser
	public String login(@RequestParam Integer user_id, HttpServletRequest servletRequest) {
		return "Hello TechGeekNextUser : " + user_id;
	}
}
