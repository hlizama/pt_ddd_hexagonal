package com.hlm.ddd_hexagonal.infraestructura.datos.repositorios;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.infraestructura.datos.crud.CuentaCrudRepository;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Cuenta;
import com.hlm.ddd_hexagonal.infraestructura.datos.interfaces.ICuentaRepository;
import com.hlm.ddd_hexagonal.infraestructura.datos.mapeo.CuentaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CuentaRepository implements ICuentaRepository {

    @Autowired
    private CuentaCrudRepository cuentaCrudRepository;

    @Autowired
    private CuentaMapper cuentaMapper;

    @Override
    public List<CuentaDTO> getAll() {
        List<Cuenta> cuentas = (List<Cuenta>) cuentaCrudRepository.findAll();
        return cuentaMapper.toAccounts(cuentas);
    }

    @Override
    public Optional<CuentaDTO> getAccount(int idcuenta) {
        return cuentaCrudRepository.findById(idcuenta)
                .map(cuenta -> cuentaMapper.toAccount(cuenta));
    }

    @Override
    public CuentaDTO save(CuentaDTO account) {
        Cuenta cuenta = cuentaMapper.toCuenta(account);
        return  cuentaMapper.toAccount(cuentaCrudRepository.save(cuenta));
    }

@Override
    public void delete(int idcuenta) {
        cuentaCrudRepository.deleteById(idcuenta);
    }
}
