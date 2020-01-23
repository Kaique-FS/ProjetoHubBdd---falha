package br.com.rsinet.hub.projetobdd.testes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub.projetobdd.pageobjects.SearchHomePage;
import br.com.rsinet.hub.projetobdd.utility.Constant;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class SearchProductHome {

	private static WebDriver driver;
	SearchHomePage SHP;

	@Dado("^usuario na pagina inicial$")
	public void usuario_na_pagina_inicial() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaique.silva\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SHP = new SearchHomePage(driver);
	}

	@Quando("^cliclou no produto$")
	public void cliclou_no_produto() {
		SHP.Clica_Produto_Home();
		
		//WebElement produto = driver.findElement(By.id("tabletsImg"));
		//produto.click();
	}

	@Quando("^selecionar um produto$")
	public void selecionar_um_produto() {
		SHP.Escolhe_produto();
		
//		WebElement tablet3 = driver.findElement(By.linkText("HP Pro Tablet 608 G1"));
//		tablet3.click();
//		WebElement color = driver.findElement(By.xpath("//*[@id=\"rabbit\"]"));
//		color.click();
	}

	@Entao("^adicionar no carrinho$")
	public void adicionar_no_carrinho() {
		SHP.Adiciona_Produto_No_Carrinho();
		
//		WebElement addcart = driver.findElement(By.name("save_to_cart"));
//		addcart.click();
	}
}
