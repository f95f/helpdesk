package com.estudo.helpdesk.repositories;

import com.estudo.helpdesk.domain.Chamado;
import com.estudo.helpdesk.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
