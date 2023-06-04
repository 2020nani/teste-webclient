package com.webflux.controller;

import com.webflux.controller.dto.UserPerfilForm;
import com.webflux.core.UserPerfil;
import com.webflux.core.service.UserPerfilService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserPerfilController {

    private final UserPerfilService userPerfilService;

    public UserPerfilController(UserPerfilService userPerfilService) {
        this.userPerfilService = userPerfilService;
    }

    @PostMapping("user")
    public Mono<UserPerfil> save(@RequestBody UserPerfilForm userPerfilForm){

        return userPerfilService.saveUserPerfil(userPerfilForm.converte());
    }

}
