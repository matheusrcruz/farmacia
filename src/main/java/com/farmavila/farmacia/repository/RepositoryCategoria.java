package com.farmavila.farmacia.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmavila.farmacia.models.ModelCategoria;


@Repository
  public interface RepositoryCategoria extends JpaRepository< ModelCategoria,String> {
	public List<ModelCategoria>findAllByMarcaContaningIgnoreCase(String marca) ;
}
