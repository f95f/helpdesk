package com.estudo.helpdesk.domain.enums;

public enum Status {

    STARTED(0, "STARTED"),
    ONGOING(1, "ONGOING"),
    CLOSED(2, "CLOSED"),
    DELAYED(3, "DELAYED"),
    PAUSED(4, "PAUSED"),
    UNDEFINED(5, "UNDEFINED");

    public Integer id;
    public String description;

    Status(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public static Status toEnum(Integer id){

        if(id == null){ return null; }
        for(Status x: Status.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Erro: Status inexistente.");
    }
}
