package com.estudo.helpdesk.domain;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person{

    private List<Chamado> chamados = new ArrayList<>();

    public Client() {
        super();
    }
    public Client(Integer id, String cpf, String name, String email, String senha) {
        super(id, cpf, name, email, senha);
    }

    public List<Chamado> getChamados() {
        return chamados;
    }
    public void setChamados(List<Chamado> chamados) {
        this.chamados = chamados;
    }
}
