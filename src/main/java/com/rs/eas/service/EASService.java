
package com.rs.eas.service;

import com.rs.eas.bean.Address;
import com.rs.eas.bean.Declaration;
import com.rs.eas.bean.EmploymentHistory;
import com.rs.eas.bean.PersonalDetails;
import com.rs.eas.bean.Qualification;

public interface EASService {
	int saveEmployeeDetails(PersonalDetails personalDetails);

	boolean saveAddresDetails(Address address);

	boolean saveEmployementHistory(EmploymentHistory employmentHistory);

	boolean saveQualification(Qualification qualification);

	boolean saveDeclaration(Declaration declaration);

}
