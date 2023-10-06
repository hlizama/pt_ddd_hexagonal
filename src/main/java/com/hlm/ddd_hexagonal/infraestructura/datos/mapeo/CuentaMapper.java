package com.hlm.ddd_hexagonal.infraestructura.datos.mapeo;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Cuenta;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuentaMapper {
    @Mappings({
            @Mapping(source = "idcuenta", target = "idaccount"),
            @Mapping(source = "numero_cuenta", target = "account_number"),
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "saldo_inicial", target = "initial_balance"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "idusuario", target = "iduser")
    })

    CuentaDTO toAccount (Cuenta cuenta);
    List<CuentaDTO>  toAccounts (List<Cuenta> cuentas);

    @InheritInverseConfiguration
    Cuenta toCuenta(CuentaDTO account);
}
