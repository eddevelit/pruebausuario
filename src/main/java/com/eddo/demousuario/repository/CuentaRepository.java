package com.eddo.demousuario.repository;

import org.springframework.data.repository.CrudRepository;
import com.eddo.demousuario.entity.Cuenta;

//Esto ser� auntoimplementado pro Spring en un Bean llaamdo CuentaRepository
public interface CuentaRepository extends CrudRepository<Cuenta, Long>{

}
