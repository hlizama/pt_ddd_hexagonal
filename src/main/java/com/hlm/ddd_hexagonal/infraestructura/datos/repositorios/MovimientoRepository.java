package com.hlm.ddd_hexagonal.infraestructura.datos.repositorios;

import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;
import com.hlm.ddd_hexagonal.infraestructura.datos.crud.MovimientoCrudRepository;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Cuenta;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Movimiento;
import com.hlm.ddd_hexagonal.infraestructura.datos.interfaces.IMovimientoRepository;
import com.hlm.ddd_hexagonal.infraestructura.datos.mapeo.MovimientoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovimientoRepository implements IMovimientoRepository {

    @Autowired
    private MovimientoCrudRepository movimientoCrudRepository;

    @Autowired
    private MovimientoMapper movimientoMapper;

    @Override
    public List<TransactionDTO> getAll() {
        List<Movimiento> movimientos = (List<Movimiento>) movimientoCrudRepository.findAll();
        return movimientoMapper.toTransactions(movimientos);
    }

    @Override
    public Optional<TransactionDTO> getTransaction(int idmovimiento) {
        return movimientoCrudRepository.findById(idmovimiento)
                .map(movimiento -> movimientoMapper.toTransaction(movimiento));
    }

    @Override
    public TransactionDTO save(TransactionDTO transaction) {
        Movimiento movimiento = movimientoMapper.toMovimiento(transaction);
        return  movimientoMapper.toTransaction(movimientoCrudRepository.save(movimiento));
    }

    @Override
    public void delete(int idmovimiento) {
        movimientoCrudRepository.deleteById(idmovimiento);
    }
}
