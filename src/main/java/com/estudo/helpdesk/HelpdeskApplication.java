package com.estudo.helpdesk;

import com.estudo.helpdesk.domain.Chamado;
import com.estudo.helpdesk.domain.Client;
import com.estudo.helpdesk.domain.Technician;
import com.estudo.helpdesk.domain.enums.Priorities;
import com.estudo.helpdesk.domain.enums.Profiles;
import com.estudo.helpdesk.domain.enums.Status;
import com.estudo.helpdesk.repositories.ChamadoRepository;
import com.estudo.helpdesk.repositories.ClientRepository;
import com.estudo.helpdesk.repositories.TechnicianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelpdeskApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

}
