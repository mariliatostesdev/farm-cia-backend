package com.generation.farmacia.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;



@Entity
@Table(name = "tb_produtos")
public class Produto {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
    
    @NotBlank(message= "O atributo nome é obrigatório")
    @Size(min=2, max =255, message = "O atributo nome deve conter no minimo 10 e no maximo 255 caracteres")
    private String nome;
	
    @NotBlank(message= "O atributo descrição é obrigatório")
	@Size(min=10, max=255, message = "O atributo descrição deve conter no minimo 10 e no maximo 255 caracteres")
    private String descricao;
	
    @NotBlank
    @Size(max = 5000, message = "O link da foto não pode ser maior do que 5000 caracteres")
    private String foto;
	
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull(message = "Preço é obrigatório!")
    @Min(0)
    private Double preco;
    
    @NotNull
	@Min(0)
	private Long quantidade;
    
    @ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}