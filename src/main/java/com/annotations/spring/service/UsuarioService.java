package com.annotations.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.spring.dto.Usuario;
import com.annotations.spring.usuarioRepository.UsuarioRepository;

@Service
@RestController // Pacote - Setereotype
public class UsuarioService {

	@Autowired // Pacote - Bens
	UsuarioRepository usuarioRepository;
	
	
	@Value("${app.name}")
	private String appName;

	

	// metodo para listar( Foi criado esse metodo no service para mostrar que os
	// pontos de dependencias)
	@ResponseBody
	@RequestMapping("/usuario")
	@GetMapping
	public List<Usuario> listarUsuario() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		System.out.println("Anotação @Value: " + appName);
		return usuarios;
	}

}
