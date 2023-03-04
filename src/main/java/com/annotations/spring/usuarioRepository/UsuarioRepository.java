package com.annotations.spring.usuarioRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.annotations.spring.dto.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
