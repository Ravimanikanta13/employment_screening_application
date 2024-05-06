
package com.rs.eas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rs.eas.bean.PersonalDetails;
import com.rs.eas.service.EASService;

@Controller
public class PersonalDetailsController {

	@Autowired
	private EASService easService;

	@RequestMapping(value = "/personalDetails", method = RequestMethod.POST)
	public ModelAndView addPersonalDetails(@ModelAttribute PersonalDetails PersonalDetails,
			HttpServletRequest request) {

		int employeeId = easService.saveEmployeeDetails(PersonalDetails);
		String viewName = null;
		HttpSession session = request.getSession();
		if (employeeId > 0) {
			session.setAttribute("employeeId", employeeId);
			viewName = "AddressHistory";
		} else {
			viewName = "PersonalDetails";
		}

		return new ModelAndView(viewName);
	}
}
