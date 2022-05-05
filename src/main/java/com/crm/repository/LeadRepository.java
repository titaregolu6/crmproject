package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
