package com.annotations.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotations.spring.dto.Usuario;
import com.annotations.spring.usuarioRepository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Controller
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;

	
	//metodo para listar
	@ResponseBody
	@RequestMapping("/listar_usuario")
	@GetMapping
	public List<Usuario> listarUsuario() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return usuarios;
	}

	
	//metodo para adcionar um novo usuario
	@ResponseBody
	@Transactional
	@RequestMapping(path = "/usuario", method = RequestMethod.PUT)
	public void atualizar(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);

	}
	
	
	// Metodo para deletar um usuario por {id}
	@ResponseBody
	@Transactional
	@DeleteMapping
	@RequestMapping(path = "/usuario/{id}")
	public void deletar(@PathVariable Long id) {
		usuarioRepository.deleteById(id);
	}

}
