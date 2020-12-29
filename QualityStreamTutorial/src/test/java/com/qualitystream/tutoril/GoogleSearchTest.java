package com.qualitystream.tutoril;


	import static org.junit.Assert.assertEquals;

	import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver; //importar clase selenium
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

	public class GoogleSearchTest {
		//@FindBy(id="ID del elemento")
		//private WebElement elemeno;
		// hihhbhmb
		//kkkkjjjj
		
		private WebDriver driver; //
		
	 //declarar anotaciones de juint before test after
		@Before //mtodo setup
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();//para que maxime la ventana que vamos a utilizar con chrome
			driver.get("http://www.google.com/"); //le envia la url al navegador y abrir
			
		}
		@Test
		public void testGooglePage() {
			
			WebElement searchbox = driver.findElement(By.name("q"));
			searchbox.clear();
			
			
			
			searchbox.sendKeys("automatizacion de pruebas de software");
			
			searchbox.submit();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			assertEquals("automatizacion de pruebas de software - Buscar con Google", driver.getTitle());
				
		}
		@After
		public void tearDown() {
		//driver.quit();
		
			
			
		}
		
		
	}
	
	

