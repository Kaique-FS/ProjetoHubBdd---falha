package br.com.rsinet.hub.projetobdd.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchHomePage {

	public SearchHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\'tabletsImg\']") // How = By | using = elemento
	private WebElement btn_tablets;

	@FindBy(how = How.LINK_TEXT, using = "HP Pro Tablet 608 G1")
	private WebElement btn_produto3;

	@FindBy(how = How.XPATH, using = "//*[@id=\\\'rabbit\\\']")
	private WebElement btn_cor;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_addcart;
	

	public void Clica_Produto_Home() {
		btn_tablets.click();
	}
	
	public void Escolhe_produto() {
		btn_produto3.click();
	}
	
	public void Escolhe_Cor_Produto() {
		btn_cor.click();
	}
	
	public void Adiciona_Produto_No_Carrinho() {
		btn_addcart.click();
	}
	
}