package com.eddo.demousuario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.eddo.demousuario.entity.Cuenta;
import com.eddo.demousuario.entity.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemousuarioApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	public void returnsNameAndAge ()
	{
		Cuenta  c  = new Cuenta();
		Usuario u  = new Usuario();
		
		u.setMail("edd.develit@gmail.com");
		u.setNombre("Eduardo");
		c.setNoCuenta(121130248);
		
		String n=u.getNombre();
		String m=u.getMail();
		int cu = c.getNoCuenta();
		
		
		String nombre = "Eduardo";
		String mail = "edd.develit@gmail.com";
		int cuenta = 121130248;
		
		assertEquals(nombre,n);
		assertEquals(mail,m);
		assertEquals(cuenta,cu);
		
		
		
	}

}
