package com.rs.eas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.eas.bean.PersonalDetails;

@Repository
public interface EmployeeRepository extends JpaRepository<PersonalDetails, Integer> {

}
