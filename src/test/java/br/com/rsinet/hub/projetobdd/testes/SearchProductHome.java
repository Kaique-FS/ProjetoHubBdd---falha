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

public class SearchProductHome {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	SearchHomeLupa SHL;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	
	@Dado("^usuario na pagina inicial$")
	public void usuario_na_pagina_inicial() {
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		//HP = new HomePage(driver);
		pageObjectManager = new PageObjectManager(driver);
		HP = pageObjectManager.getHomePage();
	}

	@Quando("^clicou no produto$")
	public void cliclou_no_produto() {
		HP.Clica_Produto_Home();
		
		//WebElement produto = driver.findElement(By.id("tabletsImg"));
		//produto.click();
	}

	@Quando("^selecionar um produto$")
	public void selecionar_um_produto() {
		HP.Escolhe_produto();
		
//		WebElement tablet3 = driver.findElement(By.linkText("HP Pro Tablet 608 G1"));
//		tablet3.click();
//		WebElement color = driver.findElement(By.xpath("//*[@id=\"rabbit\"]"));
//		color.click();
	}
	
	@Quando("^Clicar em popular items$")
	public void clicar_em_produtos_populares() {
		HP.Clica_Items_Populares();
	}
	
	@Quando("^selecionar o produto do meio$")
	public void selecionou_produto() {
		HP.Clica_No_Produto();
	}

	@Entao("^adicionar no carrinho$")
	public void adicionar_no_carrinho() {
		HP.Adiciona_Produto_No_Carrinho();
		
//		WebElement addcart = driver.findElement(By.name("save_to_cart"));
//		addcart.click();
	}
	
	@Entao("^Produto selecionado errado$")
	public void seleciona_produto_errado() {
		Assert.assertNotEquals("HP ELITEBOOK FOLIO", "HP CHROMEBOOK 14 G1(ES)");
	}
}