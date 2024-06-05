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