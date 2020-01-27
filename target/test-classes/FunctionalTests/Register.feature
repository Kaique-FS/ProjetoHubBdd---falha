#language:pt
#coding: utf-8

Funcionalidade: Realizar cadastro em um site
Descrição: Efetuar cadastro em determinado site

Cenario:
	Dado usario não cadastrado
	Quando clicar em logIn
	E clicar em novo usuario
	Entao realizar cadastro
	
Cenario:
	Dado usario não cadastrado
	Quando clicar em logIn
	E clicar em novo usuario
	Entao realizar cadastro de um usuario existente