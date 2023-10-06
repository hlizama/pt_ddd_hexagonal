package com.hlm.ddd_hexagonal.infraestructura.datos.crud;

import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository  extends CrudRepository<Usuario, Integer> {
}
