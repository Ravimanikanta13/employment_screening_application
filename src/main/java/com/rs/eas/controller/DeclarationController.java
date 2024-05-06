
package com.rs.eas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rs.eas.bean.Declaration;
import com.rs.eas.service.EASService;

@Controller
public class DeclarationController {

	@Autowired
	private EASService easService;

	@RequestMapping(value = "/declaration", method = RequestMethod.POST)
	public ModelAndView addPersonalDetails(@ModelAttribute Declaration declaration, HttpServletRequest request) {

		HttpSession session = request.getSession();
		int employeeId = Integer.parseInt(session.getAttribute("employeeId").toString());
		declaration.setApplicantId(employeeId);

		boolean isdeclarationAddded = easService.saveDeclaration(declaration);

		String viewName = null;

		if (isdeclarationAddded) {
			viewName = "SaveDetails";
		} else {
			viewName = "Declaration";
		}
		return new ModelAndView(viewName);
	}
}
