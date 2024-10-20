package com.unicauca.MoneyWise.movimientos;

import org.mapstruct.Mapper;

import java.util.List;
@Mapper(componentModel = "spring")
public interface MovimientoEntityMapper {
    MovimientoEntity toEntity(Movimiento movimiento);
    Movimiento toDomain(MovimientoEntity movimientoEntity);
    List<Movimiento> toDomainList(List<MovimientoEntity> movimientosEntity);
}
