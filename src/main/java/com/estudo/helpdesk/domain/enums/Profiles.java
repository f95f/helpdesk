package com.estudo.helpdesk.domain.enums;

public enum Profiles {

    ADMIN(0, "ADMIN"),
    CLIENTE(1, "CLIENTE"),
    TECNICO(2, "TECNICO");

    private Integer id;
    private String description;

    private Profiles(Integer id, String description){
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public static Profiles toEnum(Integer id){

        if(id == null){ return null; }
        for(Profiles x: Profiles.values()){
            if(id.equals(x.getId())){
                return x;
            }
        }
        throw new IllegalArgumentException("Erro: Perfil inexistente.");
    }
}
