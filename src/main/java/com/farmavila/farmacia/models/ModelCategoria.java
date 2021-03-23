package com.farmavila.farmacia.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "categoria")
public class ModelCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //equivalente autoIncrement
	private long id;
	
	@NotNull
	@Size(min = 5, max = 50 )
	private String marca;

	@NotNull
	@Size(min = 5, max = 50 )
	private String remedios;
	
	@NotNull
	@Size(min = 5, max = 50 )
	private String cosmeticos;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRemedios() {
		return remedios;
	}

	public void setRemedios(String remedios) {
		this.remedios = remedios;
	}

	public String getCosmeticos() {
		return cosmeticos;
	}

	public void setCosmeticos(String cosmeticos) {
		this.cosmeticos = cosmeticos;
	}

}
