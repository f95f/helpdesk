package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Priorities;
import com.estudo.helpdesk.domain.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Chamado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDateTime createdAt = LocalDateTime.now();
    @JsonFormat(pattern = "dd/MM/yy")
    private LocalDateTime concludedAt;
    private Priorities priority;
    private Status status;
    private String title;
    private String description;
    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Technician technician;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;


    public Chamado(){
        super();
        setStatus(Status.STARTED);
    }

    public Chamado(Integer id, Priorities priority, Status status, String title, String description, Technician technician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.technician = technician;
        this.title = title;
        this.description = description;
        this.client = client;
        setStatus(Status.STARTED);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getConcludedAt() {
        return concludedAt;
    }

    public void setConcludedAt(LocalDateTime concludedAt) {
        this.concludedAt = concludedAt;
    }

    public Priorities getPriority() {
        return priority;
    }

    public void setPriority(Priorities priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Technician getTecnician() {
        return technician;
    }

    public void setTecnician(Technician technician) {
        this.technician = technician;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chamado chamado = (Chamado) o;
        return Objects.equals(id, chamado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
