package com.hlm.ddd_hexagonal.dominio.servicios;

import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;
import com.hlm.ddd_hexagonal.dominio.interfaces.IMovimientoService;
import com.hlm.ddd_hexagonal.infraestructura.datos.repositorios.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoService implements IMovimientoService {

    @Autowired
    private MovimientoRepository movimientoRepository;


    @Override
    public List<TransactionDTO> getAll() {
        return movimientoRepository.getAll();
    }

    @Override
    public Optional<TransactionDTO> getTransaction(int idmovimiento) {
        return movimientoRepository.getTransaction(idmovimiento);
    }

    @Override
    public TransactionDTO save(TransactionDTO movimiento) {
        return movimientoRepository.save(movimiento);
    }

    @Override
    public boolean delete(int idmovimiento) {
        return getTransaction(idmovimiento)
                .map(movimiento -> {
                    movimientoRepository.delete(idmovimiento);
                    return  true;
                }).orElse(false);
    }
}
