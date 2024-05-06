
package com.rs.eas.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.eas.bean.Address;
import com.rs.eas.bean.Declaration;
import com.rs.eas.bean.EmploymentHistory;
import com.rs.eas.bean.PersonalDetails;
import com.rs.eas.bean.Qualification;
import com.rs.eas.repository.AddressRepository;
import com.rs.eas.repository.DeclarationRepository;
import com.rs.eas.repository.EmployeeHistoryRepository;
import com.rs.eas.repository.EmployeeRepository;
import com.rs.eas.repository.QualaficationRepository;
import com.rs.eas.service.EASService;

@Service
public class EASServiceImpl implements EASService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private EmployeeHistoryRepository employeeHistoryRepository;

	@Autowired
	private QualaficationRepository qualaficationRepository;

	@Autowired
	private DeclarationRepository declarationRepository;

	@Transactional
	@Override
	public int saveEmployeeDetails(PersonalDetails personalDetails) {
		return employeeRepository.save(personalDetails).getEmployeeId();
	}

	@Transactional
	@Override
	public boolean saveAddresDetails(Address address) {
		return addressRepository.save(address).getAddressId() > 0;
	}

	@Transactional
	@Override
	public boolean saveEmployementHistory(EmploymentHistory employmentHistory) {
		return employeeHistoryRepository.save(employmentHistory).getEmployeeId() > 0;
	}

	@Transactional
	@Override
	public boolean saveQualification(Qualification qualification) {
		return qualaficationRepository.save(qualification).getQualificationId() > 0;
	}

	@Transactional
	@Override
	public boolean saveDeclaration(Declaration declaration) {
		return declarationRepository.save(declaration).getApplicantId() > 0;
	}

}