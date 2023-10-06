package com.hlm.ddd_hexagonal.dominio.servicios;

import com.hlm.ddd_hexagonal.dominio.entidades.UserDTO;
import com.hlm.ddd_hexagonal.dominio.interfaces.IUserService;
import com.hlm.ddd_hexagonal.infraestructura.datos.repositorios.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> getAll() {
        return userRepository.getAll();
    }

    @Override
    public Optional<UserDTO> getUser(int idusuario) {
        return userRepository.getUser(idusuario);
    }

    @Override
    public UserDTO save(UserDTO user) {
        return userRepository.save(user);
    }

    @Override
    public boolean delete(int idusuario) {

        return getUser(idusuario)
                .map(usuario -> {
                    userRepository.delete(idusuario);
                    return true;
                }).orElse(false);
    }

}
