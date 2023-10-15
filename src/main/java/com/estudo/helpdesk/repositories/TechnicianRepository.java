package com.estudo.helpdesk.repositories;

import com.estudo.helpdesk.domain.Person;
import com.estudo.helpdesk.domain.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
}
