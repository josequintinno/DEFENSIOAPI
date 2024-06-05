create table if not exists tb_acesso_pessoa (
	codigo serial not null,
	id_acesso integer not null,
	id_pessoa integer not null,
	constraint pk_acesso_pessoa primary key (codigo),
	constraint fk_acesso foreign key (id_acesso) references tb_acesso,
	constraint fk_pessoa foreign key (id_pessoa) references tb_pessoa
);