package br.com.quintinnodigital.DEFESIOAPI.dto;

public class ChaveSegurancaRequestDTO {
	
	private String codigo;
	
	private String codigoCategoria;
	
	private String codigoPessoaMonitorada;
	
	private String identificador;
	
	private String senha;
	
	private String nomeAplicativo;
	
	private String url;
	
	public ChaveSegurancaRequestDTO() { }

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(String codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public String getCodigoPessoaMonitorada() {
		return codigoPessoaMonitorada;
	}

	public void setCodigoPessoaMonitorada(String codigoPessoaMonitorada) {
		this.codigoPessoaMonitorada = codigoPessoaMonitorada;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNomeAplicativo() {
		return nomeAplicativo;
	}

	public void setNomeAplicativo(String nomeAplicativo) {
		this.nomeAplicativo = nomeAplicativo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
