
package com.rs.eas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rs.eas.bean.EmploymentHistory;
import com.rs.eas.service.EASService;

@Controller
public class EmploymentHistoryController {

	@Autowired
	private EASService easService;

	@RequestMapping(value = "/employmentHistory", method = RequestMethod.POST)
	public ModelAndView addEmploymentHistory(@RequestParam("employer") String employer,
			@RequestParam("address") String address, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("jobTitle") String jobTitle,
			@RequestParam("startDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String startDate,
			@RequestParam("leavingDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String leavingDate,
			@RequestParam("reasonForLeaving") String reasonForLeaving, @RequestParam("refereeName") String refereeName,
			@RequestParam("refereeJobTitle") String refereeJobTitle,
			@RequestParam("refereePhoneEmail") String refereePhoneEmail, @RequestParam("canContact") boolean canContact,
			@RequestParam("contactDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String contactDate,
			HttpServletRequest request) {

		EmploymentHistory employmentHistory = new EmploymentHistory();
		employmentHistory.setEmployer(employer);
		employmentHistory.setAddress(address);
		employmentHistory.setPhoneNumber(phoneNumber);
		employmentHistory.setJobTitle(jobTitle);
		employmentHistory.setStartDate(startDate);
		employmentHistory.setLeavingDate(leavingDate);
		employmentHistory.setReasonForLeaving(reasonForLeaving);
		employmentHistory.setRefereeName(refereeName);
		employmentHistory.setRefereeJobTitle(refereeJobTitle);
		employmentHistory.setRefereePhoneEmail(refereePhoneEmail);
		employmentHistory.setCanContact(canContact);
		employmentHistory.setContactDate(contactDate);
		HttpSession session = request.getSession();
		int employee = Integer.parseInt(session.getAttribute("employeeId").toString());
		employmentHistory.setEmployeeId(employee);

		easService.saveEmployementHistory(employmentHistory);

		return new ModelAndView("EmployeeHistoryContinue");
	}

	@RequestMapping(value = "/employmentHistoryContinue", method = RequestMethod.POST)
	public ModelAndView addEmploymentHistoryContinue(@RequestParam("employer") String employer,
			@RequestParam("address") String address, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("jobTitle") String jobTitle,
			@RequestParam("startDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String startDate,
			@RequestParam("leavingDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String leavingDate,
			@RequestParam("reasonForLeaving") String reasonForLeaving, @RequestParam("refereeName") String refereeName,
			@RequestParam("refereeJobTitle") String refereeJobTitle,
			@RequestParam("refereePhoneEmail") String refereePhoneEmail, @RequestParam("canContact") boolean canContact,
			@RequestParam("contactDate") @DateTimeFormat(pattern = "MM/dd/yyyy") String contactDate,
			HttpServletRequest request) {

		EmploymentHistory employmentHistory = new EmploymentHistory();
		employmentHistory.setEmployer(employer);
		employmentHistory.setAddress(address);
		employmentHistory.setPhoneNumber(phoneNumber);
		employmentHistory.setJobTitle(jobTitle);
		employmentHistory.setStartDate(startDate);
		employmentHistory.setLeavingDate(leavingDate);
		employmentHistory.setReasonForLeaving(reasonForLeaving);
		employmentHistory.setRefereeName(refereeName);
		employmentHistory.setRefereeJobTitle(refereeJobTitle);
		employmentHistory.setRefereePhoneEmail(refereePhoneEmail);
		employmentHistory.setCanContact(canContact);
		employmentHistory.setContactDate(contactDate);

		HttpSession session = request.getSession();
		int employee = Integer.parseInt(session.getAttribute("employeeId").toString());
		employmentHistory.setEmployeeId(employee);
		easService.saveEmployementHistory(employmentHistory);

		return new ModelAndView("Qualification");
	}
}
