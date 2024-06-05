create table if not exists tb_categoria_acesso (
	codigo serial not null,
	descricao varchar not null,
	constraint pk_categoria_acesso primary key (codigo),
	constraint ck_categoria_acesso_descricao unique (descricao)
);