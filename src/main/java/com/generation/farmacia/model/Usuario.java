package com.generation.farmacia.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo nome é de preenchimento obrigatório!")
	@Size(max = 255, message = "Atributo nome recebe no máximo 255 caracteres")
	private String nome;

	@Schema(example = "email@email.com.br")
	@NotBlank(message = "O atributo 'usuario' é obrigatório!")
	@Email(message = "O atributo 'usuario' deve ser um email válido!")
	private String usuario;

	@NotBlank(message = "O Atributo Senha é Obrigatório!")
	@Size(min = 8, max = 255, message = "A senha deve ter entre 8 e 255 caracteres")
	private String senha;

	@Size(max = 1000, message = "O atributo foto deve conter no maximo 1000 caracteres")
	private String foto;

	@Size(max = 14, message = "Atributo cpf recebe no máximo 14 caracteres")
	private String cpf;

	public Usuario(Long id, String nome, String usuario, String senha, String foto, String cpf) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.foto = foto;
		this.cpf = cpf;
	}

	public Usuario() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}