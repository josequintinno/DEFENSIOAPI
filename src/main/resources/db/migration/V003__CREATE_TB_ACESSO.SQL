create table if not exists tb_acesso (
	codigo serial not null,
	id_pessoa_monitorada integer not null,
	id_categoria_acesso integer not null,
	identificador varchar not null,
	chave varchar not null,
	nome_aplicativo varchar null,
	endereco_url varchar null,
	data_criacao TIMESTAMP not null default now(),
	e_ativo boolean not null default true,
	constraint pk_acesso primary key (codigo),
	constraint fk_pessoa_monitorada foreign key (id_pessoa_monitorada) references tb_pessoa,
	constraint fk_categoria_acesso foreign key (id_categoria_acesso) references tb_categoria_acesso,
	constraint ck_acesso_indetificador unique (identificador)
);