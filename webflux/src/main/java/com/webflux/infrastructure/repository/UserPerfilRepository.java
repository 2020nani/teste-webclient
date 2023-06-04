package com.webflux.infrastructure.repository;

import com.webflux.core.UserPerfil;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserPerfilRepository {

    private final HashMap<UserPerfil, String> userPerfil;

    public UserPerfilRepository() {
        this.userPerfil = new HashMap<UserPerfil, String>();
    }

    public Mono<UserPerfil> addUserPerfil(final UserPerfil userPerfil, final String idUser) {
        this.userPerfil.put(userPerfil, idUser);
        System.out.println("aqui");
        return userPerfil;
    }

    public List<UserPerfil> getUserPerfil() {

        return this.userPerfil.entrySet()
                .stream()
                .map(hashMap -> hashMap.getKey())
                .collect(Collectors.toList());
    }
}
