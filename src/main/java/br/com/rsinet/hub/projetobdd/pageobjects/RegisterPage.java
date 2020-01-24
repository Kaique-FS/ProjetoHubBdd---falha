package br.com.rsinet.hub.projetobdd.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement txt_user;
	
	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement txt_password;
	
	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement txt_Confirmpassword;
	
	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement txt_email;
	
	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement txt_firstname;
	
	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement txt_lastname;
	
	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement txt_phone;
	
	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement txt_country;
	
	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement txt_city;
	
	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement txt_address;
	
	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement txt_postalcode;
	
	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement txt_state;
	
	@FindBy(how = How.NAME, using = "allowOffersPromotion")
	private WebElement btn_1;
	
	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement btn_2;
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btn_register;
	
	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement txt_notregister;
	
	public void escreve_nome() {
		txt_user.sendKeys("kaiquefs");
	}
	
	public void escreve_senha() {
		txt_password.sendKeys("Kaique1");
	}
	
	public void escreve_confimarsenha() {
		txt_Confirmpassword.sendKeys("Kaique1");
	}
	
	public void escreve_email() {
		txt_email.sendKeys("kaique.pok@gmail.com");
	}
	
	public void escreve_primeironome() {
		txt_firstname.sendKeys("Kaique");
	}
	
	public void escreve_ultimonome() {
		txt_lastname.sendKeys("Silva");
	}
	
	public void escreve_telefone() {
		txt_phone.sendKeys("+55 11 91234 5678");
	}
	
	public void escreve_pais() {
		Select oSelect = new Select(txt_country);
		oSelect.selectByVisibleText("Brazil");
	}
	
	public void escreve_cidade() {
		txt_city.sendKeys("Osasco");
	}
	
	public void escreve_endereco() {
		txt_address.sendKeys("Osasco");
	}
	
	public void escreve_codigopostal() {
		txt_postalcode.sendKeys("76857 765");
	}
	
	public void escreve_estado() {
		txt_state.sendKeys("São Paulo");
	}
	
	public void clica_checkbox1() {
		btn_1.click();
	}
	
	public void clica_checkbox2() {
		btn_2.click();
	}
	
	public void clica_registra() {
//		btn_register.sendKeys(Keys.ENTER);
		btn_register.click();
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(btn_register)).click();
	}
	
}