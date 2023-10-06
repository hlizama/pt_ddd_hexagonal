package com.hlm.ddd_hexagonal.dominio.interfaces;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;

import java.util.List;
import java.util.Optional;

public interface ICuentaService {
    public List<CuentaDTO> getAll();

    public Optional<CuentaDTO> getAccount(int idcuenta);

    public CuentaDTO save(CuentaDTO cuenta);

    public boolean delete(int idcuenta);
}
