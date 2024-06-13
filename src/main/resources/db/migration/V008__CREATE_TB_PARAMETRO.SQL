create table if not exists tb_parametro (
	codigo serial not null,
	descricao varchar not null,
	sigla varchar not null,
	valor varchar not null,
	constraint pk_parametro primary key (codigo)
);

