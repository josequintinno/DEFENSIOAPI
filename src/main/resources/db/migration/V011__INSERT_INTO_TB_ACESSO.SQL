insert into tb_pessoa (nome) values ('Claro Flex (APP)');

insert into tb_acesso (id_pessoa_monitorada, id_categoria_acesso, identificador, chave, nome_aplicativo, endereco_url) values (
	(select codigo from tb_pessoa where nome = 'Claro Flex (APP)'),
	(select codigo from tb_categoria_acesso where descricao = 'Aplicativo'),
	'09800220100',
	'67d6e69c-d5d0-4913-8114-a387949ad057',
	null,
	'https://minhaclaro.claro.com.br/mcpf/index.html'
);