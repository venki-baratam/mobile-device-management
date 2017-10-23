package com.mobile.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mobile.persistence.entity.Mobile;
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
	
	@RequestMapping("/_view")
	public ModelAndView showViewSearchForm(Model model) {
		model.addAttribute("action", "_view");
		model.addAttribute("users", userService.getAll());
		return new ModelAndView("user-view-search", "command", model);
	}
	
	@RequestMapping(value = "/view/{id}", method = RequestMethod.POST)
	public ModelAndView view(@PathVariable("id") final Integer id, Model model) {
		User user = userService.getById(id.longValue()).get();
		prepareNewForm(model);
		model.addAttribute("user", user);
		return new ModelAndView("user-view", "command", model);
	}
}
