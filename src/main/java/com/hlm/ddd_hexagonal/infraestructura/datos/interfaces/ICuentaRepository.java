package com.hlm.ddd_hexagonal.infraestructura.datos.interfaces;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;

import java.util.List;
import java.util.Optional;

public interface ICuentaRepository {
    public List<CuentaDTO> getAll();

    public Optional<CuentaDTO> getAccount(int idcuenta);

    public CuentaDTO save(CuentaDTO cuenta);

    public void delete(int idcuenta);

}
