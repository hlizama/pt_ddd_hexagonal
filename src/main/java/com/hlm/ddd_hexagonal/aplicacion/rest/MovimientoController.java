package com.hlm.ddd_hexagonal.aplicacion.rest;


import com.hlm.ddd_hexagonal.dominio.entidades.TransactionDTO;
import com.hlm.ddd_hexagonal.dominio.servicios.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class MovimientoController {

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping("/all")
    public ResponseEntity<List<TransactionDTO>> getAll() {
        return new ResponseEntity<>(movimientoService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<TransactionDTO> getTransaction(@PathVariable int id) {
        return movimientoService.getTransaction(id)
                .map(transaction -> new ResponseEntity<>(transaction, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<TransactionDTO> save(@RequestBody TransactionDTO transaction) {
        return new ResponseEntity<TransactionDTO>(movimientoService.save(transaction), HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable int id) {

        if (movimientoService.delete(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
