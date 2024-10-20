package com.unicauca.MoneyWise.movimientos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<MovimientoEntity, Long> {
}
