package com.rs.eas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.eas.bean.Qualification;

@Repository
public interface QualaficationRepository extends JpaRepository<Qualification, Integer> {

}
