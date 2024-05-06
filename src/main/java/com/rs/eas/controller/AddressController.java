
package com.rs.eas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rs.eas.bean.Address;
import com.rs.eas.service.EASService;

@Controller
public class AddressController {

	@Autowired
	private EASService easService;

	@RequestMapping(value = "/addressHistory", method = RequestMethod.POST)
	public ModelAndView addPersonalDetails(@ModelAttribute Address address, HttpServletRequest request) {

		HttpSession session = request.getSession();
		int employeeId = Integer.parseInt(session.getAttribute("employeeId").toString());
		address.setAddressId(employeeId);

		boolean isAddAddress = easService.saveAddresDetails(address);
		String viewName = null;
		if (isAddAddress) {
			viewName = "EmployeeHistory";
		} else {
			viewName = "AddressHistory";
		}
		return new ModelAndView(viewName);
	}
}
