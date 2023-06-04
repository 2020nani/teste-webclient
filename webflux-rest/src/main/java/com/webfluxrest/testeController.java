package com.webfluxrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testeController {

    @GetMapping("teste")
    public boolean retornaValid(){return true;}
}
