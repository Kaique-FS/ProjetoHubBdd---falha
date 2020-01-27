package br.com.rsinet.hub.projetobdd.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub.projetobdd.pageobjects.HomePage;
import br.com.rsinet.hub.projetobdd.pageobjects.RegisterPage;
import br.com.rsinet.hub.projetobdd.pageobjects.SearchHomeLupa;

public class PageObjectManager {

	 private WebDriver driver;
	 
	 private HomePage HP;
	 
	 private RegisterPage RP;
	
	 private SearchHomeLupa SHL;
	
	 public PageObjectManager(WebDriver driver) {
			this.driver = driver;
		}
	 
	 public HomePage getHomePage(){
			return (HP == null) ? HP = new HomePage(driver) : HP;
		}
	 
	 public RegisterPage getRegisterPage(){
		 return (RP == null) ? RP = new RegisterPage(driver) : RP;
	 }
	 
	 public SearchHomeLupa getSearchHomeLupa(){
		 return (SHL == null) ? SHL = new SearchHomeLupa(driver) : SHL;
	 }
}
