package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Profiles;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
@Entity
public abstract class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    @Column(unique = true)
    protected String cpf;
    protected String name;
    @Column(unique = true)
    protected String email;
    protected String senha;
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "perfis")
    protected Set<Integer> roles = new HashSet<>();
    @JsonFormat(pattern = "dd/MM/yyyy")
    protected LocalDateTime createdAt = LocalDateTime.now();

    public Person(){
        super();
        addRoles(Profiles.CLIENTE);
    }
    public Person(Integer id, String cpf, String name, String email, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.senha = senha;
        addRoles(Profiles.CLIENTE);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Profiles> getRoles() {
        return roles.stream().map(x -> Profiles.toEnum(x)).collect(Collectors.toSet());
    }

    public void addRoles(Profiles role) {
        this.roles.add(role.getId());
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(cpf, person.cpf) && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(senha, person.senha) && Objects.equals(roles, person.roles) && Objects.equals(createdAt, person.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, name, email, senha, roles, createdAt);
    }
}
