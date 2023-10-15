package com.estudo.helpdesk.repositories;

import com.estudo.helpdesk.domain.Client;
import com.estudo.helpdesk.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
