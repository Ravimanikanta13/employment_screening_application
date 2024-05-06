
package com.rs.eas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rs.eas.bean.Qualification;
import com.rs.eas.service.EASService;

@Controller
public class QualificationController {

	@Autowired
	private EASService easService;

	@RequestMapping(value = "/qualifications", method = RequestMethod.POST)
	public ModelAndView addPersonalDetails(@ModelAttribute Qualification qualification, HttpServletRequest request) {

		HttpSession session = request.getSession();
		int employeeId = Integer.parseInt(session.getAttribute("employeeId").toString());
		qualification.setQualificationId(employeeId);

		boolean isQualified = easService.saveQualification(qualification);
		String viewName = null;
		if (isQualified) {
			viewName = "Declaration";
		} else {
			viewName = "Qualification";
		}
		return new ModelAndView(viewName);
	}
}
