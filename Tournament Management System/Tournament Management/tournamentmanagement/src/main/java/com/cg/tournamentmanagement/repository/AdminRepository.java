package com.cg.tournamentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.tournamentmanagement.dto.Admin;

public interface AdminRepository extends JpaRepository<Long, Admin> {

}
