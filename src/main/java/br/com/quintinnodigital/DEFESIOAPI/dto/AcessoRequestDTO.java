package br.com.quintinnodigital.DEFESIOAPI.dto;

import org.modelmapper.ModelMapper;

import br.com.quintinnodigital.DEFESIOAPI.entity.AcessoEntity;

public class AcessoRequestDTO {
	
	private String codigoCategoria;
	
	private String codigoPessoaMonitorada;
	
	private String identificador;
	
	private String chave;
	
	private String nomeAplicativo;
	
	private String url;
	
	public AcessoRequestDTO() {}
	
	public AcessoRequestDTO from(AcessoEntity acessoEntity) {
		AcessoRequestDTO acessoRequestDTO = new AcessoRequestDTO();
			acessoEntity.setCodigo(acessoEntity.getCodigo());
			acessoEntity.setCategoriaAcessoEntity(acessoEntity.getCategoriaAcessoEntity());
			acessoEntity.setChave(acessoEntity.getChave());
			acessoEntity.setDataCriacao(acessoEntity.getDataCriacao());
			acessoEntity.seteAtivo(acessoEntity.geteAtivo());
			acessoEntity.setEnderecoURL(acessoEntity.getEnderecoURL());
			acessoEntity.setNomeAplicativo(acessoEntity.getNomeAplicativo());
			acessoEntity.setPessoaEntity(acessoEntity.getPessoaEntity());
		return acessoRequestDTO;
	}
	
	public static AcessoEntity from(AcessoRequestDTO acessoRequestDTO) {
		ModelMapper modelMapper = new ModelMapper();
		AcessoEntity acessoEntity = modelMapper.map(acessoRequestDTO, AcessoEntity.class);
		return acessoEntity;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
