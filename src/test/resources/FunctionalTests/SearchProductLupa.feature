#language:pt
#coding: utf-8

Funcionalidade: Procurar produto pela Lupa da HomePage
Descrição: Escrever um produto ou tipo de produto, clicar e comprar.

Cenario:
	Dado usuario na pagina inicial para usar a lupa
	Quando clicar na lupa
	E escrever o nome do produto
	Entao adicionar o produto no carrinho
	
Cenario:
	Dado usuario na pagina inicial para usar a lupa
	Quando clicar na lupa
	E escrever o nome de um produto inexistente
	Entao produto não ser encontrado