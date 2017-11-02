package com.mobile.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobile.persistence.entity.UserMobileMap;
import com.mobile.persistence.service.MobileService;
import com.mobile.persistence.service.UserMobileMapService;
import com.mobile.persistence.service.UserService;

@Controller
@RequestMapping("/assign")
public class AssignMobileToUserController {

	@Autowired
	private MobileService mobileService;

	@Autowired
	private UserService userService;

	@Autowired
	private UserMobileMapService userMobileMapService;

	private void prepareNewForm(Model model) {
		model.addAttribute("users", userService.getAll());
		model.addAttribute("mobiles", mobileService.getAll());
	}

	@RequestMapping("/_assign")
	public ModelAndView showForm(Model model) {
		prepareNewForm(model);
		return new ModelAndView("mobile-assign-to-user", "command", new UserMobileMap());
	}

	@PostMapping("assign")
	public ModelAndView assign(@Valid @ModelAttribute UserMobileMap userMobileMap, final BindingResult errors,
			final Model model, final RedirectAttributes redirectAttrs) {

		if (errors.hasErrors()) {
			prepareNewForm(model);
			return new ModelAndView("user-success", "command", model);
		}
		userMobileMap.setAssigned(true);
		userMobileMap = userMobileMapService.createUserMobileMap(userMobileMap);

		model.addAttribute("successMessage", "Assigned mobile: " + userMobileMap.getMobile().getName()
				+ " to the user: " + userMobileMap.getUser().getName());

		return new ModelAndView("user-success", "command", model);
	}

}
