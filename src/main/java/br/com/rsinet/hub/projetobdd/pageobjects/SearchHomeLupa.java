package br.com.rsinet.hub.projetobdd.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub.projetobdd.utility.Constant;

public class SearchHomeLupa {
	WebDriver driver;

	public SearchHomeLupa(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement btn_lupasearch;
	
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement btn_escrevelupa;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\\'search\\']/div/div")
	private WebElement btn_fechapesquisalupa;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement btn_addcart;
	
	@FindBy(how = How.LINK_TEXT, using = "HP Z3200 Wireless Mouse")
	private WebElement txt_produto;
	
	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement btn_escreveinvalidolupa;
	
	public void Clica_lupa_Home() {
		btn_lupasearch.click();
	}
	
	public void Escreve_na_lupa() {
		btn_escrevelupa.sendKeys(Constant.Product + Keys.ENTER);
	}
	
	public void Escreve_na_lupa_invalido() {
		btn_escrevelupa.sendKeys(Constant.ProductInvalid + Keys.ENTER);
	}
	
	public void Fecha_popup_pesquisa() {
		btn_fechapesquisalupa.click();
	}
	
	public void Adiciona_Produto_No_Carrinho() {
		btn_addcart.click();
	}
	
	public void Seleciona_produto_escolhido() {
		txt_produto.click();
	}
	
}