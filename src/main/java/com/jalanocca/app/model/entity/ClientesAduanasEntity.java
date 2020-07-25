package com.jalanocca.app.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Getter
//@Setter
@Entity
@Table(name = "_clientes_aduanas")
public class ClientesAduanasEntity {
	
	@Id
	@Column(name = "CLIENTE")
	private String cliente;
	
	@Column(name = "GRUPO")
	private String grupo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "TIP_DCTO")
	private String tipoDcto;
	
	@Column(name = "NRO_DCTO")
	private String nroDcto;
	
	@Column(name = "DIRECCION")
	private String direccion;
	
	@Column(name = "DISTRITO")
	private String distrito;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	@Column(name = "FCH_CREA")
	private String fchCrea;
	
	@Column(name = "FCH_BAJA")
	private String fchBaja;
	
	@Column(name = "USUARIO")
	private String usuario;

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDcto() {
		return tipoDcto;
	}

	public void setTipoDcto(String tipoDcto) {
		this.tipoDcto = tipoDcto;
	}

	public String getNroDcto() {
		return nroDcto;
	}

	public void setNroDcto(String nroDcto) {
		this.nroDcto = nroDcto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFchCrea() {
		return fchCrea;
	}

	public void setFchCrea(String fchCrea) {
		this.fchCrea = fchCrea;
	}

	public String getFchBaja() {
		return fchBaja;
	}

	public void setFchBaja(String fchBaja) {
		this.fchBaja = fchBaja;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	

}
