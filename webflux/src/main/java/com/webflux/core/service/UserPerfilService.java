package com.webflux.core.service;

import com.webflux.core.UserPerfil;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserPerfilService {
    Mono<UserPerfil> saveUserPerfil(UserPerfil userPerfil);
    List<UserPerfil> getUserPerfil();
}
