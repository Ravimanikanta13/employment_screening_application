package com.rs.eas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.eas.bean.EmploymentHistory;

@Repository
public interface EmployeeHistoryRepository extends JpaRepository<EmploymentHistory, Integer> {

}
