package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Profiles;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Technician extends Person{

    @OneToMany(mappedBy = "technician")
    private List<Chamado> chamados = new ArrayList<>();

    public Technician() {
        super();
        addRoles(Profiles.TECNICO);
    }
    public Technician(Integer id, String cpf, String name, String email, String senha) {
        super(id, cpf, name, email, senha);
        addRoles(Profiles.TECNICO);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
