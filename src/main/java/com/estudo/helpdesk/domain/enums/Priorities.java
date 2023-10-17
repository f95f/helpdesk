package com.estudo.helpdesk.domain.enums;

public enum Priorities {

    NENHUMA(0, "NENHUMA"),
    BAIXA(1, "BAIXA"),
    MEDIA(2, "MEDIA"),
    ALTA(3, "ALTA"),
    URGENTE(4, "URGENTE");


    private Integer id;
    private String description;

    private Priorities(Integer id, String description){
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public static Priorities toEnum(Integer id){

        if(id == null){ return null; }
        for(Priorities x: Priorities.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Erro: Valor de prioridade inexistente.");

    }

}
