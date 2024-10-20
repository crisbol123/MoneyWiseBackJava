package com.unicauca.MoneyWise.usuarios;

import com.unicauca.MoneyWise.JwtService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {
    private  final UsuarioRepository usuarioRepository;
    private final PasswordEncoder encoder;
private final UsuarioEntityMapper mapper;
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsServiceImp;
    private final JwtService jwtService;



    public void save(Usuario usuario) {

        UsuarioEntity entity =  mapper.aEntidad(usuario);
        entity.setContrasena(encoder.encode(usuario.getContrasena()));
        usuarioRepository.save(entity);
    }

    public AuthResponse login(LoginRequest loginRequest) {
authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getCorreo(), loginRequest.getContrasena()));
        UserDetails user= userDetailsServiceImp.loadUserByUsername(loginRequest.getCorreo());
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();

    }
}
