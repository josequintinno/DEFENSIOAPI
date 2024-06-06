drop table if exists flyway_schema_history;
drop table if exists tb_acesso;
drop table if exists tb_pessoa;
drop table if exists tb_categoria_acesso;

create table if not exists tb_pessoa (
	codigo serial not null,
	nome varchar not null,
	constraint pk_pessoa primary key (codigo),
	constraint ck_pessoa_nome unique (nome)
);

create table if not exists tb_categoria_acesso (
	codigo serial not null,
	descricao varchar not null,
	constraint pk_categoria_acesso primary key (codigo),
	constraint ck_categoria_acesso_descricao unique (descricao)
);

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

insert into tb_pessoa (nome) values ('José Quintinno');
insert into tb_pessoa (nome) values ('Google');
insert into tb_pessoa (nome) values ('Microsoft');
insert into tb_pessoa (nome) values ('Apple');
insert into tb_pessoa (nome) values ('Amazon');
insert into tb_pessoa (nome) values ('Mercado Livre');

select * from tb_pessoa;

insert into tb_categoria_acesso (descricao) values ('E-mail');
insert into tb_categoria_acesso (descricao) values ('Aplicativo');
insert into tb_categoria_acesso (descricao) values ('Website');
insert into tb_categoria_acesso (descricao) values ('Cartão de Crédito');

select * from tb_categoria_acesso;

insert into tb_acesso (
	id_pessoa_monitorada, id_categoria_acesso, identificador, chave, nome_aplicativo, 
	endereco_url) values (
	(select codigo from tb_pessoa where nome = 'Microsoft'),
	(select codigo from tb_categoria_acesso where descricao = 'E-mail'),
	'josequintino@outlook.com.br',
	'f47ac10b-58cc-4372-a567-0e02b2c3d479',
	null,
	'http://outlook.live.com'
);

insert into tb_acesso (
	id_pessoa_monitorada, id_categoria_acesso, identificador, chave, nome_aplicativo, 
	endereco_url) values (
	(select codigo from tb_pessoa where nome = 'Microsoft'),
	(select codigo from tb_categoria_acesso where descricao = 'E-mail'),
	'josequintino@hotmail.com.br',
	'd7d1b0f1-bb7b-4584-95b7-82c33cfd68a8',
	null,
	'http://outlook.live.com'
);

insert into tb_acesso (
	id_pessoa_monitorada, id_categoria_acesso, identificador, chave, nome_aplicativo, 
	endereco_url) values (
	(select codigo from tb_pessoa where nome = 'Microsoft'),
	(select codigo from tb_categoria_acesso where descricao = 'E-mail'),
	'jose.quintinno@outlook.com.br',
	'b9c31e79-6e13-4f10-9e43-2c27f30b6c7f',
	null,
	'http://outlook.live.com'
);

select * from tb_acesso;
