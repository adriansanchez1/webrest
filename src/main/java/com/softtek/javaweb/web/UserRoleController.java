package com.softtek.javaweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softtek.javaweb.service.UserRoleService;

@Controller
@RequestMapping("/userRole")
public class UserRoleController {

	@Autowired
	UserRoleService userRoleService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String userRoleListController (Model model) {
		model.addAttribute("userRoles", userRoleService.getList());	
		return "userRole/list";
	}
	
}
