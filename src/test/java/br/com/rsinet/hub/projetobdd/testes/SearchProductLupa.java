package br.com.rsinet.hub.projetobdd.testes;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub.projetobdd.dataProvider.ConfigFileReader;
import br.com.rsinet.hub.projetobdd.managers.FileReaderManager;
import br.com.rsinet.hub.projetobdd.managers.PageObjectManager;
import br.com.rsinet.hub.projetobdd.pageobjects.HomePage;
import br.com.rsinet.hub.projetobdd.pageobjects.RegisterPage;
import br.com.rsinet.hub.projetobdd.pageobjects.SearchHomeLupa;
import br.com.rsinet.hub.projetobdd.utility.Constant;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchProductLupa {
	
	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	SearchHomeLupa SHL;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;

	@Dado("^usuario na pagina inicial para usar a lupa$")
	public void usuario_na_pagina_inicial_para_usar_a_lupa() {
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		SHL = new SearchHomeLupa(driver);
	}
	
	@Quando("^clicar na lupa$")
	public void clicar_na_lupa() {
		SHL.Clica_lupa_Home();
	}

	@Quando("^escrever o nome do produto$")
	public void escrever_o_nome_do_produto() {
		SHL.Escreve_na_lupa();
		SHL.Seleciona_produto_escolhido();
	}
	
	@Quando("^escrever o nome de um produto inexistente$")
	public void escrever_o_nome_do_produto_invalido() {
		SHL.Escreve_na_lupa_invalido();
	}

	@Entao("^adicionar o produto no carrinho$")
	public void adicionar_o_produto_no_carrinho() {
		SHL.Adiciona_Produto_No_Carrinho();
	}
	
	@Entao("^produto não ser encontrado$")
	public void produto_inexistente() {
		Assert.assertEquals("No results for " + Constant.ProductInvalid, "No results for Biscoito");
	}
}