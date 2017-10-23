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

import com.mobile.persistence.entity.User;
import com.mobile.persistence.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	private void prepareNewForm(Model model) {
		model.addAttribute("users", userService.getAll());
	}

	@RequestMapping("/_create")
	public ModelAndView showForm(Model model) {
		prepareNewForm(model);
		model.addAttribute("user", new User());
		return new ModelAndView("user-form", "command", new User());
	}

	@PostMapping("create")
	public ModelAndView create(@Valid @ModelAttribute final User user, final BindingResult errors,
			final Model model, final RedirectAttributes redirectAttrs) {

		if (errors.hasErrors()) {
			prepareNewForm(model);
			return new ModelAndView("user-success", "command", model);
		}

		userService.createUser(user);

		model.addAttribute("successMessage", "User created successfully with name  " + user.getName());

		return new ModelAndView("user-success", "command", model);
	}
}
