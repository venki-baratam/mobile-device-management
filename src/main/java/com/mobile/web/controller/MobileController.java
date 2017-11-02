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
import com.mobile.persistence.service.MobileService;

@Controller
@RequestMapping("/mobile")
public class MobileController {

	@Autowired
	private MobileService mobileService;

	private void prepareNewForm(Model model) {
		model.addAttribute("mobiles", mobileService.getAll());
	}

	@RequestMapping("/_create")
	public ModelAndView showForm(Model model) {
		prepareNewForm(model);
		model.addAttribute("mobile", new Mobile());
		return new ModelAndView("mobile-form", "command", new Mobile());
	}

	@PostMapping("create")
	public ModelAndView create(@Valid @ModelAttribute final Mobile mobile, final BindingResult errors,
			final Model model, final RedirectAttributes redirectAttrs) {

		if (errors.hasErrors()) {
			prepareNewForm(model);
			return new ModelAndView("mobile-success", "command", model);
		}

		mobileService.createMobile(mobile);

		model.addAttribute("successMessage", "Mobile created successfully with name  " + mobile.getName());

		return new ModelAndView("mobile-success", "command", model);
	}

	@RequestMapping("/_view")
	public ModelAndView showViewSearchForm(Model model) {
		model.addAttribute("action", "_view");
		model.addAttribute("mobiles", mobileService.getAll());
		return new ModelAndView("mobile-view-search", "command", model);
	}

	@RequestMapping(value = "/view/{id}", method = RequestMethod.POST)
	public ModelAndView view(@PathVariable("id") final Integer id, Model model) {
		Mobile mobile = mobileService.getById(id.longValue()).get();
		prepareNewForm(model);
		model.addAttribute("mobile", mobile);
		return new ModelAndView("mobile-view", "command", model);
	}

}