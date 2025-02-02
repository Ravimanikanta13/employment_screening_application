package com.rs.eas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IntroductionController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("Introduction");
	}

	@RequestMapping(value = "/introduction", method = RequestMethod.POST)
	public ModelAndView personalDetails() {
		return new ModelAndView("PersonalDetails");
	}

}
