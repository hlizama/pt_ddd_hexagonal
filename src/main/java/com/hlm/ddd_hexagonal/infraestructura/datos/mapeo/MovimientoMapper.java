package com.hlm.ddd_hexagonal.infraestructura.datos.mapeo;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Cuenta;
import com.hlm.ddd_hexagonal.infraestructura.datos.entidades.Movimiento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MovimientoMapper {

    @Mappings({
            @Mapping(source = "idmovimiento", target = "idtransaction"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "idcuenta", target = "idaccount"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "movimiento", target = "transaction"),
            @Mapping(source = "saldo", target = "balance")
    })
    TransactionDTO toTransaction (Movimiento movimiento);
    List<TransactionDTO> toTransactions (List<Movimiento> movimientos);

    @InheritInverseConfiguration
    Movimiento toMovimiento(TransactionDTO transaction);

}
