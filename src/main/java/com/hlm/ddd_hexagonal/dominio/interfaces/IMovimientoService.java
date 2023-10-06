package com.hlm.ddd_hexagonal.dominio.interfaces;

import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;

import java.util.List;
import java.util.Optional;

public interface IMovimientoService {

    public List<TransactionDTO> getAll();
    public Optional<TransactionDTO> getTransaction(int idmovimiento);

    public TransactionDTO save(TransactionDTO movimiento);

    public boolean delete(int idmovimiento);
}
