package com.hlm.ddd_hexagonal.infraestructura.datos.crud;

import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Movimiento;
import org.springframework.data.repository.CrudRepository;

public interface MovimientoCrudRepository extends CrudRepository<Movimiento, Integer> {
}
