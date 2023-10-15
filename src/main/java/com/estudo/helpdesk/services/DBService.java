package com.estudo.helpdesk.services;

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
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private TechnicianRepository technicianRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ChamadoRepository chamadoRepository;
    public void instanciarDB(){

        Technician t1 = new Technician(null, "Ksakama", "12312312312", "kz@mail.com", "123321");
        t1.addRoles(Profiles.ADMIN);

        Client c1 = new Client(null, "Riobaldo", "12345678910", "riob@m.com", "1234");

        Chamado ch1 = new Chamado(null, Priorities.MEDIA, Status.ONGOING, "Chamadoh 1", "1 Chamadoh", t1, c1);

        technicianRepository.saveAll(Arrays.asList(t1));
        clientRepository.saveAll(Arrays.asList(c1));
        chamadoRepository.saveAll(Arrays.asList(ch1));

    }

}
