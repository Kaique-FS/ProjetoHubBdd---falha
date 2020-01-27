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

public class Register {

	WebDriver driver;
	HomePage HP;
	RegisterPage RP;
	SearchHomeLupa SHL;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;

	@Dado("^usario não cadastrado$")
	public void usario_não_cadastrado() {
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.get(Constant.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		RP = new RegisterPage(driver);
		HP = new HomePage(driver);

	}

	@Quando("^clicar em logIn$")
	public void clicar_em_logIn() {
		HP.Clica_usuario();
	}

	@Quando("^clicar em novo usuario$")
	public void clicar_em_novo_usuario() {
		HP.Clica_novo_usuario();
	}

	@Entao("^realizar cadastro$")
	public void realizar_cadastro() {
		RP.escreve_nome();
		RP.escreve_email();
		RP.escreve_senha();
		RP.escreve_confimarsenha();
		RP.escreve_primeironome();
		RP.escreve_ultimonome();
		RP.escreve_telefone();
		RP.escreve_pais();
		RP.escreve_cidade();
		RP.escreve_endereco();
		RP.escreve_estado();
		RP.escreve_codigopostal();
		RP.clica_checkbox1();
		RP.clica_checkbox2();
		RP.clica_registra();
	}
	
	@Entao("^realizar cadastro de um usuario existente$")
	public void realizar_cadastro_ja_existente() {
		RP.escreve_nome();
		RP.escreve_email();
		RP.escreve_senha();
		RP.escreve_confimarsenha();
		RP.escreve_primeironome();
		RP.escreve_ultimonome();
		RP.escreve_telefone();
		RP.escreve_pais();
		RP.escreve_cidade();
		RP.escreve_endereco();
		RP.escreve_estado();
		RP.escreve_codigopostal();
		RP.clica_checkbox1();
		RP.clica_checkbox2();
		RP.clica_registra();
		Assert.assertNotEquals(Constant.URL, driver.getCurrentUrl());
	}

}
