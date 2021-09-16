package com.teste1.mark1.banco.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="codigo")
	private Integer codigo;
	@Column(name="nome")
	private String nome;
	@Column(name="salario")
	private Double salario;
	@Column(name="codigosetor")
	private Integer codigoSetor;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Integer getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(Integer codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public List<Funcionario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}	
