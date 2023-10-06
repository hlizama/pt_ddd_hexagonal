package com.hlm.ddd_hexagonal.dominio.servicios;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.dominio.interfaces.ICuentaService;
import com.hlm.ddd_hexagonal.infraestructura.datos.repositorios.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaService implements ICuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public List<CuentaDTO> getAll() {
        return cuentaRepository.getAll();
    }

    @Override
    public Optional<CuentaDTO> getAccount(int idcuenta) {
        return  cuentaRepository.getAccount(idcuenta);
    }

    @Override
    public CuentaDTO save(CuentaDTO cuenta) {
        return cuentaRepository.save(cuenta);
    }

    @Override
    public boolean delete(int idcuenta) {
        return getAccount(idcuenta)
                .map(cuenta -> {
                    cuentaRepository.delete(idcuenta);
                    return true;
                }).orElse(false);
    }
}
