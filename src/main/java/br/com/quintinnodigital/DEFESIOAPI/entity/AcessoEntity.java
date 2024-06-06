package br.com.quintinnodigital.DEFESIOAPI.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_ACESSO")
public class AcessoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO", nullable = false)
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa_monitorada", nullable = false)
	private PessoaEntity pessoaEntity;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria_acesso", nullable = false)
	private CategoriaAcessoEntity categoriaAcessoEntity;
	
	@Column(name = "IDENTIFICADOR", nullable = false)
	private String identificador;
	
	@Column(name = "CHAVE", nullable = false)
	private String chave;
	
	@Column(name = "NOME_APLICATIVO")
	private String nomeAplicativo;
	
	@Column(name = "ENDERECO_URL")
	private String enderecoURL;
	
	@Column(name = "DATA_CRIACAO", nullable = false)
	private Date dataCriacao;
	
	@Column(name = "E_ATIVO", nullable = false)
	private Boolean eAtivo;
	
	public AcessoEntity() { }

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public PessoaEntity getPessoaEntity() {
		return pessoaEntity;
	}

	public void setPessoaEntity(PessoaEntity pessoaEntity) {
		this.pessoaEntity = pessoaEntity;
	}

	public CategoriaAcessoEntity getCategoriaAcessoEntity() {
		return categoriaAcessoEntity;
	}

	public void setCategoriaAcessoEntity(CategoriaAcessoEntity categoriaAcessoEntity) {
		this.categoriaAcessoEntity = categoriaAcessoEntity;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getChave() {
		return chave;
	}

	public void setChave(String chave) {
		this.chave = chave;
	}

	public String getNomeAplicativo() {
		return nomeAplicativo;
	}

	public void setNomeAplicativo(String nomeAplicativo) {
		this.nomeAplicativo = nomeAplicativo;
	}

	public String getEnderecoURL() {
		return enderecoURL;
	}

	public void setEnderecoURL(String enderecoURL) {
		this.enderecoURL = enderecoURL;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Boolean geteAtivo() {
		return eAtivo;
	}

	public void seteAtivo(Boolean eAtivo) {
		this.eAtivo = eAtivo;
	}

}
