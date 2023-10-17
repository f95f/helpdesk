package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Profiles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Client extends Person{
    private static final long serialVersionUID = 1L;
    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Chamado> chamados = new ArrayList<>();

    public Client() {
        super();
        addRoles(Profiles.CLIENTE);
    }
    public Client(Integer id, String cpf, String name, String email, String senha) {
        super(id, cpf, name, email, senha);
        addRoles(Profiles.CLIENTE);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
