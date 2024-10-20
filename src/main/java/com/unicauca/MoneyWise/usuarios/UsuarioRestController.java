package com.unicauca.MoneyWise.usuarios;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@AllArgsConstructor
public class UsuarioRestController {
    private UsuarioService service;

 @PostMapping("/save")
    public void save(Usuario usuario) {
        service.save(usuario);
    }
    @PostMapping("/login")
    public void login(LoginRequest loginRequest) {
        service.login(loginRequest);
    }

}
