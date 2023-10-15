package com.estudo.helpdesk.repositories;

import com.estudo.helpdesk.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
