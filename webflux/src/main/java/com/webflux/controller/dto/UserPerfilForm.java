package com.webflux.controller.dto;

import com.webflux.core.UserPerfil;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserPerfilForm {

    private String id;
    private String nome;

    public UserPerfil converte() {
        return UserPerfil.builder()
                .id(this.id)
                .nome(this.nome)
                .build();
    }
}
