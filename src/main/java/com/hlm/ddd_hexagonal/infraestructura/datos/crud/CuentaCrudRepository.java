package com.hlm.ddd_hexagonal.infraestructura.datos.crud;

import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Cuenta;
import org.springframework.data.repository.CrudRepository;

public interface CuentaCrudRepository extends CrudRepository<Cuenta, Integer> {
}
