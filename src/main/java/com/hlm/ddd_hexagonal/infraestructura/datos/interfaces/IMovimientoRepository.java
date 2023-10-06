package com.hlm.ddd_hexagonal.infraestructura.datos.interfaces;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;

import java.util.List;
import java.util.Optional;

public interface IMovimientoRepository {

    public List<TransactionDTO> getAll();
    public Optional<TransactionDTO> getTransaction(int idmovimiento);

    public TransactionDTO save(TransactionDTO movimiento);

    public void delete(int idmovimiento);

}
