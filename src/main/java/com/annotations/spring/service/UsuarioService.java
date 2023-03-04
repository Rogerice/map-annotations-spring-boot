package com.annotations.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.annotations.spring.LazyBean;
import com.annotations.spring.MyBean;
import com.annotations.spring.dto.Usuario;
import com.annotations.spring.usuarioRepository.UsuarioRepository;

@Service
@RestController // Pacote - Setereotype
//@Scope("singleton") Pacote - Context 
@Scope("prototype") // Pacote - Context
@PropertySource("classpath:custom.properties")
public class UsuarioService {

	@Autowired // Pacote - Bens
	UsuarioRepository usuarioRepository;

	@Value("${app.name}") // Pacote - Bens
	private String appName;

	@Autowired
	private MyBean myBean;

	@Autowired
	private LazyBean lazyBean;

	@Value("${message}")
	private String message;

	public void UsuarioService() {
		System.out.println("!!!!!!!!!Scope UsuarioService criado!!!!!!!");
	}

	// metodo para listar
	@ResponseBody
	@RequestMapping("/usuario")
	@GetMapping
	public List<Usuario> listarUsuario() {
		List<Usuario> usuarios = usuarioRepository.findAll();

		return usuarios;
	}

	// Metodo criado apenas para mostrar o @Value e @bean
	@ResponseBody
	@GetMapping("/annotation")
	public long countUsuarios() {
		long contarUsuarios = usuarioRepository.count();
		System.out.println("!!!Anotação @Value!!!!: " + appName);
		System.out.println("!!!Anotação @PropertySource !!!!: " + message);
		myBean.method();
		UsuarioService();

		return contarUsuarios;
	}

}
