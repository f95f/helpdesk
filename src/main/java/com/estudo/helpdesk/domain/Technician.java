package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Profiles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Technician extends Person{
    private static final long serialVersionUID = 1L;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "technician")
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
