package com.igor.minhasFinancias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	
	@Column(name="id")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="senha")
	private String senha;
}
