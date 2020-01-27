#language:pt
#coding: utf-8

Funcionalidade: Procurar produto pela HomePage
Descrição: Seleciona um produto da massa de produtos da pagina inicial 

Cenario:
	Dado usuario na pagina inicial
	Quando clicou no produto
	E selecionar um produto
	Entao adicionar no carrinho
	
Cenario:
	Dado usuario na pagina inicial
	Quando Clicar em popular items
	E selecionar o produto do meio
	Entao Produto selecionado errado