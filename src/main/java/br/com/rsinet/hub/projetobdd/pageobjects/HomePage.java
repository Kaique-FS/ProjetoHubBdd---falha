package br.com.rsinet.hub.projetobdd.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Dados para logIn/cadastro

	@FindBy(how = How.ID, using = "menuUserLink") 
	private WebElement btn_user;
	
	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]") 
	private WebElement btn_newuser;
	
	//pesquisa massa de dados
	
	@FindBy(how = How.XPATH, using = "//*[@id=\'tabletsImg\']") // How = By | using = elemento
	private WebElement btn_tablets;

	@FindBy(how = How.LINK_TEXT, using = "HP Pro Tablet 608 G1")
	private WebElement btn_produto3;

	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_addcart;
	
	// menu interativo
	
	@FindBy(how = How.XPATH, using = "/html/body/header/nav/ul/li[6]/a")
	private WebElement btn_popularitems;
	
	@FindBy(how = How.ID, using = "details_10")
	private WebElement btn_produto_meio;
	
	public void Clica_usuario() {
		btn_user.click();
	}
	
	public void Clica_novo_usuario() {
		btn_newuser.sendKeys(Keys.ENTER);
	}

	public void Clica_Produto_Home() {
		btn_tablets.click();
	}
	
	public void Escolhe_produto() {
		btn_produto3.click();
	}
	
	public void Adiciona_Produto_No_Carrinho() {
		btn_addcart.click();
	}
	
	public void Clica_Items_Populares() {
		btn_popularitems.click();
	}
	
	public void Clica_No_Produto() {
		btn_produto_meio.click();
	}
	
}