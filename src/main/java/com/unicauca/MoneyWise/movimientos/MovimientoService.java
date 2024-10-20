package com.unicauca.MoneyWise.movimientos;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovimientoService {

    private final MovimientoRepository movimientoRepository;
    private final MovimientoEntityMapper movimientoEntityMapper;

    public List<Movimiento> getMovimientos() {

        return  movimientoEntityMapper.toDomainList(movimientoRepository.findAll());

    }
    public void saveMovimiento(Movimiento movimiento) {
        movimientoRepository.save(movimientoEntityMapper.toEntity(movimiento));
    }
}
