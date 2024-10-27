package com.unicauca.MoneyWise.movimientos;

import com.unicauca.MoneyWise.usuarios.Usuario;
import com.unicauca.MoneyWise.usuarios.UsuarioEntityMapper;
import com.unicauca.MoneyWise.usuarios.UsuarioRepository;
import com.unicauca.MoneyWise.usuarios.UsuarioService;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;


@Mapper(componentModel = "spring")
public interface MovimientoEntityMapper {

    @Mapping(target = "usuario", ignore = true)
    MovimientoEntity toEntity(Movimiento movimiento);



    Movimiento toDomain(MovimientoEntity movimientoEntity);

    List<Movimiento> toDomainList(List<MovimientoEntity> movimientosEntity);
}
