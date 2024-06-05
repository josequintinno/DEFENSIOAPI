create table if not exists tb_pessoa (
	codigo serial not null,
	nome varchar not null,
	constraint pk_pessoa primary key (codigo),
	constraint ck_pessoa_nome unique (nome)
);