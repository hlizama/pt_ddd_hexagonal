package com.hlm.ddd_hexagonal.aplicacion.rest;

import com.hlm.ddd_hexagonal.dominio.entidades.CuentaDTO;
import com.hlm.ddd_hexagonal.dominio.entidades.UserDTO;
import com.hlm.ddd_hexagonal.dominio.servicios.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/all")
    public ResponseEntity<List<CuentaDTO>> getAll(){
        return new ResponseEntity<>(cuentaService.getAll(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<CuentaDTO> getUser(@PathVariable int id){
        return cuentaService.getAccount(id)
                .map(account -> new ResponseEntity<>(account, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<CuentaDTO> save(@RequestBody CuentaDTO account){
        return new ResponseEntity<CuentaDTO>(cuentaService.save(account), HttpStatus.CREATED);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable int id) {

        if (cuentaService.delete(id)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}
