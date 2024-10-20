package com.unicauca.MoneyWise.usuarios;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioEntityMapper {
    UsuarioEntity aEntidad(Usuario usuario);
    Usuario aUsuario(UsuarioEntity entity);
}
