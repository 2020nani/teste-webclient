package com.webflux.core.service;

import com.webflux.controller.dto.UserPerfilForm;
import com.webflux.core.UserPerfil;
import com.webflux.infrastructure.repository.UserPerfilRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@Service
public class UserPerfilServiceImpl implements UserPerfilService{

    private final UserPerfilRepository userPerfilRepository;

    public UserPerfilServiceImpl(UserPerfilRepository userPerfilRepository) {
        this.userPerfilRepository = userPerfilRepository;
    }

    @Override
    public Mono<UserPerfil> saveUserPerfil(UserPerfil userPerfil) {
        Mono<Boolean> teste = WebClient.create()
                .get()
                .uri("http://localhost:8081/teste")
                .retrieve()
                .bodyToMono(Boolean.class);



        teste.subscribe(product -> log.info(product.toString()));
        return userPerfilRepository.addUserPerfil(userPerfil,userPerfil.getId());
    }

    @Override
    public List<UserPerfil> getUserPerfil() {
        return null;
    }
}
