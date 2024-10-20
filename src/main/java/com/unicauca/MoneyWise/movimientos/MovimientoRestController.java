package com.unicauca.MoneyWise.movimientos;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimientos")
@AllArgsConstructor
public class MovimientoRestController {
private final MovimientoService movimientoService;

    @GetMapping
    public String getMovimientos() {
        return "Movimientos";
    }
    @PostMapping
    public ResponseEntity saveMovimiento(Movimiento movimiento) {
        movimientoService.saveMovimiento(movimiento);
        return ResponseEntity.ok().build();
    }
}
