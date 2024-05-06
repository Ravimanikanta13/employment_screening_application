package com.rs.eas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rs.eas.bean.Declaration;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Integer> {

}
