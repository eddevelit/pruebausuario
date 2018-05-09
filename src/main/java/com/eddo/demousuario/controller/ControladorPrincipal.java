package com.eddo.demousuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eddo.demousuario.entity.Cuenta;
import com.eddo.demousuario.entity.Usuario;
import com.eddo.demousuario.repository.CuentaRepository;
import com.eddo.demousuario.repository.UsuarioRepository;

@Controller//Indicamos que la clase es un controlador
@RequestMapping("/demo")
public class ControladorPrincipal {
	@Autowired//Obtenemos el bean userRepository
	private UsuarioRepository userRepository;
	@Autowired
	private CuentaRepository cuentaRepository;
	
	@GetMapping("/add")//Mapea solamente peticiones GET
	public @ResponseBody String agregaNuevo(@RequestParam String nombre, @RequestParam String mail, @RequestParam Integer cuenta) {
		//@ResponseBody quiere decir que que el valor de retorno sera el valor de la respuesta
		//@RequestParam indica que sera un parámetro de una peticion GET o POST
		
		Usuario u = new Usuario();
		Cuenta c = new Cuenta();
		u.setNombre(nombre);
		u.setMail(mail);
		c.setNoCuenta(cuenta);
		userRepository.save(u);
		cuentaRepository.save(c);
		return "Saved";
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Usuario> obtenerUsuaerios(){
		return userRepository.findAll();
	}
	
}
