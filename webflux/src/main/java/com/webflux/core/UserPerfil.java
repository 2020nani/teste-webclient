package com.webflux.core;

import lombok.Builder;
import lombok.Data;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@Data
@Builder
public class UserPerfil extends Mono<UserPerfil> {
    private String id;
    private String nome;
    private boolean enabled;

    @Override
    public void subscribe(CoreSubscriber<? super UserPerfil> coreSubscriber) {
        coreSubscriber.onComplete();
    }
}
