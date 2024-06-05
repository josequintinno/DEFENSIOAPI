package br.com.quintinnodigital.DEFESIOAPI.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PESSOA", schema = "public")
public class PessoaEntity {
	
	@Id
	@GeneratedValue
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	public PessoaEntity() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
