package com.annotations.spring.usuarioRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.annotations.spring.dto.Usuario;


@Component //pacote Setereotype
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
