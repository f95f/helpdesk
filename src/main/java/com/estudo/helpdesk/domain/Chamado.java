package com.estudo.helpdesk.domain;

import com.estudo.helpdesk.domain.enums.Priorities;
import com.estudo.helpdesk.domain.enums.Status;
import java.time.LocalDateTime;
import java.util.Objects;

public class Chamado {

    private Integer id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime concludedAt;
    private Priorities priority;
    private Status status;
    private Tecnician tecnician;
    private Client client;

    public Chamado(){
        super();
        setStatus(Status.STARTED);
    }

    public Chamado(Integer id, Priorities priority, Status status, Tecnician tecnician, Client client) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.tecnician = tecnician;
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

    public Tecnician getTecnician() {
        return tecnician;
    }

    public void setTecnician(Tecnician tecnician) {
        this.tecnician = tecnician;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
