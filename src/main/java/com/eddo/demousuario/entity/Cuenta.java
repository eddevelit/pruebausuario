package com.eddo.demousuario.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer noCuenta;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNoCuenta() {
		return noCuenta;
	}
	public void setNoCuenta(Integer noCuenta) {
		this.noCuenta = noCuenta;
	}
	
	
	

}
